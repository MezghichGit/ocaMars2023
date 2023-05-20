package chapitre5_20052023;

public class Animal {
	
	int age=10;
	String espece;
	
	public void m1() {
		this.m2();
	}
	
	public void m2() {}
	
	public Animal(int age, String espece) {
		// appel au constructeur par défaut
		//this();  // doit être toujours première instruction
		this.age = age;
		this.espece = espece;
		System.out.println("Constructeur Animal avec paramètres");
	}
/*
	public Animal() {
		//this(1,"ab");
		System.out.println("Constructeur Animal par défaut");
		
	}*/

}
