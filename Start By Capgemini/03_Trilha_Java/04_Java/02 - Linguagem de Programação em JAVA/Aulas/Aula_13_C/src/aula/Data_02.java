package aula;

import java.util.Calendar;

public class Data_02 {

	public static void main(String[] args) {
		// 1. Recuperação da data e hora atual com a classe Calendar
        System.out.println("==> Recuperação da data com a classe Calendar");
		// Obtém a instância de Calendar com a data/hora atual
        Calendar cal = Calendar.getInstance();
        System.out.println("Data e Hora atual: " + cal.getTime() + "\n");

        // 2. Exibição do dia da semana, mês e ano
        System.out.println("==> Mostra o dia da semana, mês e ano");
        System.out.println("Data/Hora atual: " + cal.getTime());
        System.out.println("Ano: " + cal.get(Calendar.YEAR));
		// Adiciona 1 ao mês (começa de 0)
        System.out.println("Mês: " + (cal.get(Calendar.MONTH) + 1)); 
        System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

        // 3. Alteração da data usando o método set
        System.out.println("==> Alterando a data/hora com método set");
        cal.set(Calendar.YEAR, 2022);
		// Janeiro é representado pelo índice 0
        cal.set(Calendar.MONTH, Calendar.JANUARY); 
        cal.set(Calendar.DAY_OF_MONTH, 4);

        System.out.println("Data/Hora alterada: " + cal.getTime());
        System.out.println("Ano: " + cal.get(Calendar.YEAR));
		// Adiciona 1 ao mês (começa de 0)
        System.out.println("Mês: " + (cal.get(Calendar.MONTH) + 1)); 
        System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

        // 4. Recuperação da hora do dia e saudação com base na hora
        System.out.println("==> Recuperando a hora do dia");
		// Nova instância de Calendar
        Calendar cal1 = Calendar.getInstance();
		// Obtém a hora no formato 24 horas 
        int hora = cal1.get(Calendar.HOUR_OF_DAY); 

        //Verificando a hora do dia e saldando o usuario.
        System.out.println("Agora são: " + hora + " hrs");
		// Saudação conforme a hora do dia
        if (hora >= 6 && hora < 12) {
            System.out.println("Bom Dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
	}

}
