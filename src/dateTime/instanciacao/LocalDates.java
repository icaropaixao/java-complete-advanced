package dateTime.instanciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDates {

    public static void main(String[] args) {

        // Cria um formatador para datas no padrão "dd/MM/yyyy" (ex: 20/07/2022)
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Cria um formatador para datas e horas no padrão "dd/MM/yyyy HH:mm" (ex: 20/07/2022 01:30)
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtém a data atual (sem a hora)
        LocalDate d01 = LocalDate.now();

        // Obtém a data e hora atuais
        LocalDateTime d02 = LocalDateTime.now();

        // Obtém a data e hora atuais no padrão UTC (formato Instant)
        Instant d03 = Instant.now();

        // Faz o parsing de uma string no formato padrão ISO (YYYY-MM-DD) para LocalDate
        LocalDate d04 = LocalDate.parse("2022-07-20");

        // Faz o parsing de uma string no formato ISO com data e hora (YYYY-MM-DDTHH:MM:SS) para LocalDateTime
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        // Faz o parsing de uma string no formato ISO com data, hora e UTC (com 'Z' no final) para Instant
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Faz o parsing de uma string ISO com fuso horário explícito para Instant
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // Faz o parsing de uma data no formato customizado "dd/MM/yyyy" usando o formatador format1
        LocalDate d08 = LocalDate.parse("20/07/2022", format1);

        // Faz o parsing de uma data e hora no formato customizado "dd/MM/yyyy HH:mm" usando o formatador format2
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", format2);

        // Cria uma data específica usando o método 'of' do LocalDate
        LocalDate d10 = LocalDate.of(2022, 07, 20);

        // Cria uma data e hora específicas usando o método 'of' do LocalDateTime
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        // Exibe as variáveis de datas e horas
        System.out.println("d01 = " + d01);  // Exibe a data atual
        System.out.println("d02 = " + d02);  // Exibe a data e hora atuais
        System.out.println("d03 = " + d03);  // Exibe a data e hora atuais no padrão UTC (Instant)
        System.out.println("d04 = " + d04);  // Exibe a data parseada "2022-07-20" (LocalDate)
        System.out.println("d05 = " + d05);  // Exibe a data e hora parseada "2022-07-20T01:30:26" (LocalDateTime)
        System.out.println("d06 = " + d06);  // Exibe a data e hora no UTC com 'Z' (Instant)
        System.out.println("d07 = " + d07);  // Exibe a data e hora com fuso horário explícito (Instant)
        System.out.println("d08 = " + d08);  // Exibe a data parseada no formato "20/07/2022" (LocalDate)
        System.out.println("d09 = " + d09);  // Exibe a data e hora parseada no formato "20/07/2022 01:30" (LocalDateTime)
        System.out.println("d10 = " + d10);  // Exibe a data criada usando 'of' (LocalDate)
        System.out.println("d11 = " + d11);  // Exibe a data e hora criadas usando 'of' (LocalDateTime)
    }
}
