
public class Main {

	public static void main(String[] args) {
		/*
		Voiture v1 = new Voiture(); //appel au constructeur par défaut
		//System.out.println(v1);
		v1.Voiture(); //appel à la méthode voiture
		v1.demarrer();
		Voiture v2 = new Voiture();
		//System.out.println(v2);
		
		System.out.println(v1.getPrix());
		System.out.println(v1.getMarqueModele());
		v1.prix = 12000;
		v1.marque="Toyota";
		v1.modele="CHR";
		System.out.println(v1.getPrix());
		System.out.println(v1.getMarqueModele());
		
		System.out.println(v2.getPrix());
		System.out.println(v2.getMarqueModele());
        */
		/*
		Voiture v1 = new Voiture();
		System.out.println(v1.getPrix());
		System.out.println(v1.getMarqueModele());
		
		Voiture v2 = new Voiture("Toyota","CHR",12000);
		
		System.out.println(v2.getPrix());
		System.out.println(v2.getMarqueModele());*/
		
		System.out.println(Voiture.VitesseMax);
		Voiture v1 = new Voiture();//modele, marque, prix
		Voiture v2 = new Voiture();// marque, modele, prix
		v1.VitesseMax = 340;
		System.out.println(v1.VitesseMax);
		System.out.println(v2.VitesseMax);
		System.out.println(Voiture.VitesseMax);

	}

}
