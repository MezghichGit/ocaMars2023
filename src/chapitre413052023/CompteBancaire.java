package chapitre413052023;

public class CompteBancaire { //Classe encapsulée
	
	public void somme(String[] tab, String...arg)
	{}
	private String nom=null;
	public CompteBancaire() {
		super();
	}
	public CompteBancaire(String nom, double solde) {
	super();
	this.nom = nom;
	this.solde = solde;
}
	public String getNom() {
		return nom;
	}
	/*public void setNom(String nom) {
		this.nom = nom;
	}*/
	public double getSolde() {
		return solde;
	}
	/*public void setSolde(double solde) {
		if(solde<-1000)
			System.out.println("Vous ne pouvez pas dépasser 1000 DT");
		else
		this.solde = solde;
	}*/
	private double solde;

}
