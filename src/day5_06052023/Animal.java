package day5_06052023;

public class Animal {
	int age;
	String nom;
	public Animal(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", nom=" + nom + "]";
	}

}
