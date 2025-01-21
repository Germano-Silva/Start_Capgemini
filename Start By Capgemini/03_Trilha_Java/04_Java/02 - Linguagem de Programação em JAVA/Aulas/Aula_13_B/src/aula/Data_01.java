package aula;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

public class Data_01 {

	public static void main(String[] args) throws ParseException{
		// 1. Configuração dos formatos de data com SimpleDateFormat
        System.out.println("==> Configurando formatos de data com SimpleDateFormat");
        // Define o formato de data como "dia/mês/ano"
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        // Define o formato de data como "dia/mês/ano horas/minutos/segundos"
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // Define o formato de data e hora como "dia/mês/ano horas:minutos:segundos"
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        /*
        * O horário GMT (Greenwich Mean Time) é a referência para fusos horários globais,
        * com cada fuso sendo 
        * calculado em relação a ele, como GMT+3 ou GMT-5. O GMT é fixo e não considera o 
        * horário de verão. 
        * O UTC (Coordinated Universal Time) é mais preciso que o GMT, pois é baseado em 
        * relógios atômicos. 
        * Exemplo: 12:00 GMT corresponde a 15:00 em GMT+3 e 07:00 em GMT-5.
        */
        // Define o fuso horário GMT no formato sdf3
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); 

        // 2. Criação de objetos Date
        System.out.println("\n==> Criando objetos Date");
        // Data específica em milissegundos (corrigido erro de divisão)
        Date x1 = new Date(1635552000000L);
        // Data atual 
        Date x2 = new Date(System.currentTimeMillis());
        /*
        * A época Unix é o ponto de referência para o cálculo de tempo em sistemas de
        * computadores, que começa 
        * em 01/01/1970 às 00:00:00 UTC. O tempo é contado em segundos desde esse momento. 
        * Portanto, a data correspondente à época Unix é 01/01/1970 00:00:00 UTC, e valores
        * em milissegundos 
        * a partir dessa data representam diferentes instantes no tempo.
        */
        // Data correspondente à época Unix (01/01/1970)
        Date x3 = new Date(0L);
        // Data correspondente a 5 horas após a época Unix
        Date x4 = new Date(1000L * 60L * 60L * 5L); 

        // 3. Conversão de String para Date
        System.out.println("\n==> Convertendo Strings para objetos Date");
        // Data sem hora
        Date y1 = (Date) sdf1.parse("29/12/2021"); 
        // Data com hora
        Date y2 = (Date) sdf2.parse("29/12/2021 16:32:55");
        // Data com formato ISO 8601
        // ISO 8601 é um padrão internacional para datas e horas no formato "YYYY-MM-DDTHH:mm:ssZ"
        Date y3 = (Date) Date.from(Instant.parse("2021-12-29T16:32:55Z")); 

        // 4. Exibição de valores não formatados
        System.out.println("\n==> Exibindo valores originais dos objetos Date");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        // 5. Exibição de valores formatados com sdf2
        System.out.println("\n==> Exibindo valores formatados com sdf2");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));

        // 6. Exibição de valores formatados com sdf3 (GMT)
        System.out.println("\n==> Exibindo valores formatados com sdf3 (GMT)");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
	}

}
