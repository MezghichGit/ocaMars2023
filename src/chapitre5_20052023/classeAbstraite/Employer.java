package chapitre5_20052023.classeAbstraite;

public abstract class Employer{
	String nom;
	int age;
	double salaire = 2000;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void calculSalaire();
}
