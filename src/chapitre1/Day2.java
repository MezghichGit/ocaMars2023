package chapitre1;

public class Day2 {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		Etudiant e3 = new Etudiant();
		e1 = e2;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		/*
		System.out.println("Debut du programme...");
		e1 = e2;
		e3 = null;
		//System.gc(); // appel au garbage collector(Thread)

		for (int i = 0; i < 1000; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("Fin du programme...");*/

	}

}
