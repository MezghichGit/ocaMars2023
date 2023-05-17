package chapitre6_17_05_2023;

public class Personne {
	
	public static void saisieAge(int age) throws IllegalArgumentException {
	if(age<0) {
		throw new IllegalArgumentException("Age non valide");
	}
	System.out.println(age);
	}

	public static void main(String[] args) {
		try {
		 saisieAge(-10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
