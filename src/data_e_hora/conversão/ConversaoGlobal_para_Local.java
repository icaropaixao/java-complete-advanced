package data_e_hora.conversão;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoGlobal_para_Local {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // converte o d06 para formatação local padrão da maquina
        LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // converte para o fuso horario de Portugal
        LocalDateTime resultado3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // converte para o horario Local
        LocalDateTime resultado4 = LocalDateTime.ofInstant(Instant.from(d06), ZoneId.of("Portugal"));

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);

        System.out.println("d04 dia = "+ d04.getDayOfMonth()); // pega o dia do mes da data escolhida
        System.out.println("d04 Mês = " + d04.getMonthValue()); // pega o numero do mes
        System.out.println("d04 Ano = " + d04.getYear()); // pega o Ano

        System.out.println("d05 Hora = " + d05.getHour()); // pega a hora da data
        System.out.println("d05 Minutos = " + d05.getMinute()); // pega os minutos


    }
}