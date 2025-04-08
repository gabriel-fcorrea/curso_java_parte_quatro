package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCalc {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);

		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("Atual LocalDate: " + d01);
		System.out.println("Past Week LocalDate: " + pastWeekLocalDate);
		System.out.println("Next Week LocalDate: " + nextWeekLocalDate);

		System.out.println("\nAtual LocalDateTime: " + d02);
		System.out.println("Past Week LocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("Next Week LocalDateTime: " + nextWeekLocalDateTime);

		System.out.println("\nAtual Instant: " + d03);
		System.out.println("Past Week Instant: " + pastWeekInstant);
		System.out.println("Next Week Instant: " + nextWeekInstant);

		// "atTime(0, 0)" é o mesmo que "atStartOfDay"

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); // conversao para
																								// localdatetime
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);

		Duration t3 = Duration.between(pastWeekInstant, d03);

		Duration t4 = Duration.between(d03, pastWeekInstant);

		System.out.println("\nDias T1: " + t1.toDays());
		System.out.println("Dias T2: " + t2.toDays());
		System.out.println("Dias T3: " + t3.toDays());
		System.out.println("Dias T4 (T3 inverso): " + t4.toDays());

	}
}
