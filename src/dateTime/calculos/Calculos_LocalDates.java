package dateTime.calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos_LocalDates {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        System.out.println("LOCAL DATE");
        // criando uma nova varivael com datas modificadas
        LocalDate semanaAnteriorLocalDate = d04.minusDays(7);
        LocalDate proximaSemanaLocalDate = d04.plusDays(7);

        System.out.println("data original: " + d04); // data original
        System.out.println("Semana anterior: " + semanaAnteriorLocalDate); // data uma semana antes da d04
        System.out.println("Proxima Semana " + proximaSemanaLocalDate); // data uma semana depois da d04

        System.out.println("____________________________");

        System.out.println("LOCAL DATE TIME ");

        LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);
        LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);

        System.out.println("Data original: " + d05);
        System.out.println("Proxima semana: " + proximaSemanaLocalDateTime);
        System.out.println("Semana anterior: " + semanaAnteriorLocalDateTime);

        System.out.println("____________________________");

        System.out.println("INSTANT ");

        Instant proximaSemanaInstant = d06.plus(7,ChronoUnit.DAYS);
        Instant semanaAnterirorInstant = d06.minus(7,ChronoUnit.DAYS);

        System.out.println("Data original: " + d06);
        System.out.println("Proxima semana: " + proximaSemanaInstant);
        System.out.println("Semana anterior: " + semanaAnterirorInstant);

        System.out.println("____________________________");

        System.out.println("CALCULO DE DURAÇÃO E DIFERENÇA ENTRE DATAS");

        Duration tempo1 = Duration.between(proximaSemanaLocalDate.atStartOfDay(), d04.atStartOfDay()); // converte o Local Date para que aceite horas e minutos
        Duration tempo2 = Duration.between(proximaSemanaLocalDateTime, d05);
        Duration tempo3 = Duration.between(proximaSemanaInstant, d06);


        // mostra a diferença entre as duas datas
        System.out.println(tempo1.toDays());
        System.out.println(tempo2.toDays());
        System.out.println(tempo3.toDays());

    }
}