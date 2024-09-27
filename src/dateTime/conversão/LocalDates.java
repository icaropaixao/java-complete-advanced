package dateTime.conversão;

import java.time.Instant; // Importa a classe para manipulação de pontos no tempo (UTC)
import java.time.LocalDate; // Importa a classe para manipulação de datas sem hora
import java.time.LocalDateTime; // Importa a classe para manipulação de datas e horas
import java.time.ZoneId; // Importa a classe para manipulação de fusos horários
import java.time.format.DateTimeFormatter; // Importa a classe para formatação de data e hora

public class LocalDates {
    public static void main(String[] args) {
        // Faz o parsing de strings em objetos LocalDate, LocalDateTime e Instant
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Data sem hora
        LocalDateTime d05 = LocalDateTime.parse("2024-04-13T03:33:33"); // Data e hora
        Instant d06 = Instant.parse("2024-01-04T03:33:33Z"); // Data e hora em UTC

        // Criação de formatadores de data/hora com padrões diferentes
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato: "dd/MM/yyyy"
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato: "dd/MM/yyyy HH:mm"
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Formato: "dd/MM/yyyy HH:mm" com ajuste para o fuso horário do sistema
        // Adicionando formatações para diferentes formatos de exibição
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME; // Formato padrão ISO para LocalDateTime
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT; // Formato padrão ISO para Instant


        // Exibe as datas e horas sem formatação
        System.out.println("sem formatação: " + d04); // Exibe a data d04
        System.out.println("sem formatação: " + d05); // Exibe a data e hora d05
        System.out.println("Sem formatação: " + d06); // Exibe o instante d06

        System.out.println("----------------------");

        // Formas de utilizar o formatador para exibir as datas
        System.out.println("Com formatação: " + formato3.format(d06)); // Exibe d06 formatado com o fuso horário do sistema
        System.out.println("Com formatação: " + d05.format(formato2)); // Exibe d05 formatado usando formato2
        System.out.println("Com formatação: " + d04.format(formato1)); // Exibe d04 formatado usando formato1
        System.out.println("Com formatação: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Exibe d04 formatado com um novo formatador

        System.out.println("d05 em formato ISO: " + d05.format(formato4)); // Exibe d05 no formato ISO
        System.out.println("d06 em formato ISO: " + formato5.format(d06)); // Exibe d06 no formato ISO
    }
}
