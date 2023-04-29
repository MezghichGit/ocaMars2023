package day4_15_04_2023.lesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDates_Times {
	//Exemple d'overloading
	public void info(int x, double y, int z) {}
	public void info(double y,int x) {}
	public void info(int x) {}
	public void info() {}
	public static void main(String[] args) {
		//1)Creating date and time
		
		//LocalDate ld = LocalDate.now(); // now() méthode static ; appel direct par le nom de la classe
		//System.out.println(ld);
		/*
		LocalDate ld = LocalDate.of(2015, 3, 12);
		System.out.println(ld);
		LocalDate ld2 = LocalDate.of(2015, Month.MARCH, 12);
		System.out.println(ld2);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt2 = LocalTime.of(11,10);
		System.out.println(lt2);
		
		LocalDateTime ldt = LocalDateTime.of(ld2, lt2);
		System.out.println(ldt);
		LocalDateTime ldt2 = LocalDateTime.of(2015, 2, 10, 10, 15);
		System.out.println(ldt2);*/
		
		//2)Manipulating date and time
		/*
		LocalDate ld = LocalDate.of(2015, 1, 2);
		//ld=ld.plusDays(10);
		
		//ld = ld.minusDays(3);
		//System.out.println(ld.plusDays(4));
		//System.out.println(ld);
		Period period = Period.ofYears(2);
		//Period period = Period.of(1, 2, 3);
		ld = ld.plus(period);
		System.out.println(ld);
		
		//LocalTime lt = LocalTime.of(10, 10);
		//lt.plus(period);
		*/
		//3)Formatting date and time
		
		LocalDate ld = LocalDate.of(2015, 1, 2);
		System.out.println(ld); // affichage par défaut ISO
		//LocalTime lt =LocalTime.of(12, 30);
		LocalDateTime ldt = LocalDateTime.of(2023,04,15,12,22);
		//Création d'un format Très long
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//System.out.println(ldt.format(f));
		
		//Custom Format : 2023,04-01:12:30
		/*
		DateTimeFormatter cf = DateTimeFormatter.ofPattern("yyyy---MMMM---dd::hh:mm");
		System.out.println(cf.format(ldt));
		System.out.println(ldt.format(cf));
		Integer x = 10;
		System.out.println(x);*/
		
		//Exemple Parsing:
		DateTimeFormatter cf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateNaissance = "20-10-2000";
		LocalDate ldc = LocalDate.parse(dateNaissance, cf);
		System.out.println(ldc);

	}

}
