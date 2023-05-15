package chapitre413052023;

public class Personne {
	
	private int age;
	String nom; //package private: visible dans le package
	protected double poids;
	public String poste;
	
	public void infoPersonne()
	{
		System.out.println(age+" "+poids);
	}
	
	private void info()// visible dans le package
	{
		System.out.println("Une personne");
	}
	
     void getNom()// méthode package private
	{
		System.out.println("Une personne");
	}

}
