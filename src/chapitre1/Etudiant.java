package chapitre1;

public class Etudiant {

	String nom;
	int age;
	/*
	public void finalize()
	{
		System.out.println("Destruction d'un objet Etudiant");
	}*/
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Etudiant() {

	}
}
