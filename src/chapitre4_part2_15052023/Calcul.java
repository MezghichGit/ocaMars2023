package chapitre4_part2_15052023;

@FunctionalInterface
public interface Calcul {
	
	 abstract void operation(); //une méthode abstraite
	
	//à partir de la version 8, on peut déclarer des méthodes concrêtes
	
	public default void info() {
		System.out.println("Hello from interface, conrête methode");
	}
	
	public static void affichage() {
		System.out.println("Hello from interface, conrête static methode");
	}
	
	public static void VitesseMax() {
		System.out.println("Vitesse Max d'une voiture ne dépasse pas 400km/h");
	}

}
