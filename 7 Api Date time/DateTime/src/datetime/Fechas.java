package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Fechas {

	public static void main(String[] args) {
		
		
		
		LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		
//		LocalDate dateManual = LocalDate.of(2019, 03, 25);
//		System.out.println(dateManual);
//		
//		System.out.println(dateManual.getEra());
//		
//		dateManual = LocalDate.of(2019, Month.MARCH, 25);
//		System.out.println(dateManual);
//		
//		LocalDate formateada = LocalDate.now();
//		
//		String fecha = formateada.format(DateTimeFormatter.ISO_LOCAL_DATE);
//		System.out.println(fecha);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);
//		
//		
//		Clock clock = Clock.systemDefaultZone();
//		System.out.println(clock.millis());
//		
//		
//		Instant i = Instant.now();
//		
//		ZoneId zone = ZoneId.of("Africa/Nairobi");
//		ZonedDateTime result = i.atZone(zone);
//		
//		System.out.println(result);
//		
//		
//		LocalTime t1 = LocalTime.of(9, 10);
//		LocalTime t2 = LocalTime.of(17, 10);
//		
//		Duration dur = Duration.between(t1, t2);
//		System.out.println(dur);
//		
//		
//		Duration d1 = Duration.of(1,ChronoUnit.DAYS);
//		System.out.println(d1);
//		
//		System.out.println("----------");
//		
//		LocalDate l1 = LocalDate.of(2019, 3, 1);
//		LocalDate l2 = LocalDate.of(2015, 3, 2);
//		
//		Period per = Period.between(l1, l2);
//		
//		System.out.println(per);
//		
//		System.out.println(per.getDays());
//		
//		String pattern = "dd.M.yyyy";
//		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
//		System.out.println(df.format(LocalDateTime.now()));
		
		
		
		
		
		
		
		

	}

}
