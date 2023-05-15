package chapitre413052023;

public class Test {

	public static void main(String[] args) {
		/*
		try {
		    Voiture.info(10);
		}
		catch(Exception e)
		{
			System.out.println("Problème : " + e.getMessage());
		}*/
		//Voiture v = new Voiture();
		//v.dispaly(0);
		try {
		Voiture.division(10,2);
		return;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//return; // provoque la sortie immédiate de la méthode
		}
		finally {  //Fermeture de connexion avec les serveurs BD
		    System.out.println("Suite du programme...");
		}
	}

}
