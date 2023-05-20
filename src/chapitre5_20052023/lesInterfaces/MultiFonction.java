package chapitre5_20052023.lesInterfaces;

public class MultiFonction extends Device implements Imprimante, Photocopieuse, Scanner{

	@Override
	public void scanner() {
		System.out.println("Photocopie en couleur");
		
	}

	@Override
	public void photocopier() {
		System.out.println("Photocopie en couleur");
		
	}

	@Override
	public void imprimer() {
		System.out.println("Photocopie en noir et blanc et couelur");
		
	}

}
