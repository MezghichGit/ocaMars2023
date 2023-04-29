package day4_15_04_2023;

public class Etudiant extends Personne{

	
	public void info(int x) // Overloadg = Surcharge(chapitre 4)
	{
		System.out.println("Etudiant");
	}
	@Override
	public void info() // Overriding = Redefinition (chapitre 5)
	{
		System.out.println("Etudiant");
	}
}
