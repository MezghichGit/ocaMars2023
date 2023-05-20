package chapitre5_20052023;

public class Oiseau extends Animal{
	/*
	public Oiseau() {
	//super();
		super(1,"ab"); //	appel au constructeur parent avec paramètres
		System.out.println("Constructeur Oiseau par défaut");
	}*/

	double poids;
	String catagorie;
	int age=12;
	
	public void info()
	{
		System.out.println(this.poids+ this.catagorie+this.espece+this.age);
	}
	
	public void info2()
	{
		System.out.println(this.poids+ this.catagorie+super.espece+super.age);
	}
	
	public void displayAge()
	{
		System.out.println("Age Animal : "+super.age); // classe mère
		System.out.println("Age Oiseau : "+this.age); // classe fille
	}
}
