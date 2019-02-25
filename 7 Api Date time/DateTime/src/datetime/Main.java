package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		getCalendarDate();
		getLocalDate();
		getLocalTime();
		getLocalDateTime();
		getInstant();
		getTimeZone();
		getDuration();
		getPeriodos();
		getFormatted();
	}
	
		public static void getCalendarDate() {
			//Calendar ¡deprecada!
			Calendar calendar = new GregorianCalendar(2014,2,18);
			System.out.println(calendar.getTime());
		}			
		
		public static void getLocalDate() {
		//LocalDate
			LocalDate date = LocalDate.of(1990,11,11);
			System.out.println(date.getYear());
			System.out.println(date.getMonth());
			System.out.println(date.getDayOfMonth());
			
			date = LocalDate.of(1990, Month.NOVEMBER, 11);
			System.out.println(date);
			
			//fecha actual
			date = LocalDate.now();
			System.out.println(date);
		}
		
		public static void getLocalTime() {
			//localTime
			LocalTime time = LocalTime.of(5, 30,45,35);
			System.out.println(time.getHour());
			System.out.println(time.getMinute());
			System.out.println(time.getSecond());
			System.out.println(time.getNano());
			
			//Hora actual
			time = LocalTime.now();
			System.out.println(time);
		}
		
		public static void getLocalDateTime() {
			//LocalDateTime
			LocalDateTime dateTime = LocalDateTime.of(1990, 11, 11, 5,30,45,35);
			System.out.println(dateTime);
			
			LocalDate date = LocalDate.of(1990, Month.NOVEMBER, 11);
			LocalTime time = LocalTime.of(5, 30,45,35);
			
			dateTime = LocalDateTime.of(date, time);
			System.out.println(dateTime);
			
			//Datetime actual
			dateTime = LocalDateTime.now();
			System.out.println(dateTime);
		}
		
		public static void getInstant() {
			//Instant
			Instant instant = Instant.now();
			System.out.println(instant);
		}
		
		public static void getTimeZone() {
			//Con timezone
	        Instant instante = Instant.now(); 
	  
	        System.out.println("Instant: "+ instante); 
	  
	        ZoneId zone = ZoneId.of("Asia/Aden"); 
	  
	        ZonedDateTime result = instante.atZone(zone); 
	  
	        System.out.println("ZonedDateTime: "+ result); 
		}
		
		public static void getDuration() {
			
			//Duration
			LocalTime localTime1 = LocalTime.of(12, 25);
			LocalTime localTime2 = LocalTime.of(17, 8);
			Duration duracion = Duration.between(localTime1, localTime2);
			System.out.println("Duración entre fechas 1: "+duracion);
			
			LocalDateTime localDT1 = LocalDateTime.of(2016,Month.APRIL, 18,14,15);
			LocalDateTime localDT2 = LocalDateTime.of(2016,Month.NOVEMBER, 20,17,20);
			duracion = Duration.between(localDT1, localDT2);
			System.out.println("Duración entre fechas 2: "+duracion);
			
			Duration oneDay = Duration.of(1, ChronoUnit.DAYS);
			System.out.println("Duración de dia 1: " + oneDay);
			
			oneDay = Duration.ofDays(1);
			System.out.println("Duración de dia 2: "+oneDay);
		}
		
		public static void getPeriodos() {
			//Periodos
			LocalDate localDate1 = LocalDate.of(2016, Month.APRIL, 10);
			LocalDate localDate2 = LocalDate.of(2016, Month.NOVEMBER, 15);
			
			Period period = Period.between(localDate1, localDate2);
			System.out.println("Periodo 1: "+period);
			
			period = Period.ofDays(1);
			System.out.println("Periodo 2: "+period);
		}
		
		public static void getFormatted() {
			//Formateando con ISO LOCAL DATE una fecha
			System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2018, 3, 9)));

			//Agregando TimeZone y un Offset de 3 horas
			System.out.println(DateTimeFormatter.ISO_OFFSET_DATE.format(LocalDate.of(2018, 3, 9).atStartOfDay(ZoneId.of("UTC-3"))));
			
			//Agregando formatos con estilos predefinidos:

			LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
			System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
			System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
			System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
			System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
			
			//Agregando nuestro formato:

			String europeanDatePattern = "dd.MM.yyyy";
			DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
			System.out.println(europeanDateFormatter.format(LocalDate.of(2016, 7, 31)));
			
			String timeColonPattern = "HH:mm:ss";
			DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(timeColonPattern);
			LocalTime colonTime = LocalTime.of(17, 35, 50);
			System.out.println(timeColonFormatter.format(colonTime));
			
			String newYorkDateTimePattern = "dd.MM.yyyy HH:mm z";
			DateTimeFormatter newYorkDateFormatter = DateTimeFormatter.ofPattern(newYorkDateTimePattern);
			LocalDateTime summerDay = LocalDateTime.of(2016, 7, 31, 14, 15);
			System.out.println(newYorkDateFormatter.format(ZonedDateTime.of(summerDay, ZoneId.of("UTC-4"))));

		}
}
