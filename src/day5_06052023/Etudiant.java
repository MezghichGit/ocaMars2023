package day5_06052023;

public class Etudiant implements Comparable{
	String nom;
	int age;
	int moy;
	public Etudiant(String nom, int age, int moy) {
		this.nom = nom;
		this.age = age;
		this.moy = moy;
	}
	@Override
	public int compareTo(Object o) {
		Etudiant temp = (Etudiant)o;
		
		//return (this.age - temp.age);
		return (this.moy - temp.moy);
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moy=" + moy + "]";
	}
	
	
	

}
