package day4_15_04_2023;

import java.util.ArrayList;

public class Application {
	String ch;
	static final int v = 14;
	enum Jour{
		LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
	}
	public static void info() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers;
		/*
		int x = 10;  // type primitif
		Integer X = 10 ;  // type reference(wrapper classe = classe enveloppe)
		String ch = X.toString();
		String tab[] = new String[2];
		tab[0] = ch;*/
	
		//1) La structure à choix multiples switch
		
		//v++;
		int x = 3;
		final int y = 10; // final = constante
		//y = y+1;
		//y++;
		switch(x) {
		case 9 : System.out.println("En dessous de la moyenne"); break;
		case y: System.out.println("La moyenne"); break;
		case v: System.out.println("Plus que la moyenne"); break;
		default : System.out.println("Autre valeur");
		}
		
		// 2)Types compatibles avec switch
		/*
		String certif="OCP";
		
		switch(certif) {
		case "OCA" : System.out.println("Vous êtes un Dev. Java confirmé!"); break;
		case "OCP" : System.out.println("Vous êtes un Expert Java!"); info(); break;
		case "Spring" : System.out.println("Vous êtes un Expert Spring!"); break;
		default : System.out.println("Bravo pour ton effort!");
		}*/
		/*
		Jour day = Jour.DIMANCHE;
		switch (day) {
		case LUNDI : case MERCREDI: System.out.println("Je travail toute la journée"); break;
		case MARDI: case JEUDI : System.out.println("Je travail et je fais du sport"); break;
		case SAMEDI: case DIMANCHE: System.out.println("Report"); break;
		default : System.out.println("Valeur invalide"); 
		}*/

	}

}
