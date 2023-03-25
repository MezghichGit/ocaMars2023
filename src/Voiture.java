
public class Voiture {
	
	static double  VitesseMax = 320;
	
	//les attributs
	String marque;
	String modele;
	double prix;
	
	//les méthodes(les actions)
	
	public void demarrer()
	{
		System.out.println("Voiture qui démarrer");
	}
	
	public void sarreter()
	{
		System.out.println("Voiture qui démarrer");
	}
	
	public double getPrix()
	{
		return prix;
	}
	
	public String getMarqueModele()
	{
		return "Marque : "+marque+" Modèle : "+modele;
	}
	
	//contructeur par défaut explicite
	
	public Voiture() {
		System.out.println("Constructeur par défaut");
	}
	
	public Voiture(double prix) {
		System.out.println("Constructeur avec 1 paramètre");
		this.prix = prix;
	}
	
	public Voiture(String marque, String modele, double prix) { // constructeur avec 3 paramètres
		System.out.println("Constructeur avec 3 paramètres");
		this.marque = marque;
		this.modele = modele;
		this.prix= prix;
	}
	
	public void Voiture() {
		System.out.println("Une simple méthode");
	}

}
