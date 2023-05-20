package chapitre5_20052023.lesInterfaces;

public interface Imprimante {
	public static final int duree=10; //public static final
	//avant la version 8
	public void imprimer(); //service
	
	// après la version 8
	
	public default void info() {
		System.out.println("Une imprimante");
	}
	
	public static void affichage() {
		System.out.println("Une imprimante");
	}
	
	// a partir de la version 9
	
	//private void info2() {}
	
	

}
