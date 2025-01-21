package aula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data_03 {

	public static void main(String[] args) throws ParseException {
		// 1. Obtenção da data atual com a classe Calendar
        // Obtém a instância de Calendar com a data/hora atual
        Calendar c = Calendar.getInstance();
        // Converte para o tipo Date 
        Date data = (Date) c.getTime(); 

        // 2. Formatação da data com SimpleDateFormat
        System.out.println("==> Formatação da data com SimpleDateFormat");
        // Define o padrão de formatação
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.println("Data formatada: " + sdf.format(data) + "\n");

        // 3. Conversão de String para Date
        System.out.println("==> Conversão de String para Date");
        // Data no formato String
        String dataTexto = "02/08/1970"; 
        // Converte a String para um objeto Date
        Date dataConvertida = (Date) sdf.parse(dataTexto); 
        System.out.println("Data convertida: " + dataConvertida);

	}

}
