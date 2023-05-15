package chapitre413052023;

import java.sql.SQLException;

public final class Voiture {
	
	//1)Déclaration d'une méthode en Java
	
	public static final  void info(double prix) throws IllegalArgumentException, ArithmeticException
	{
		if(prix == 0.0)
		{
			throw new IllegalArgumentException("Prix ne doit pas être égale à zéro");
		}
		System.out.println("Prix = "+prix);
		//throw new NullPointerException();
	}
	
	public void dispaly(double prix)
	{
		System.out.println("Prix = "+prix);
		throw new IllegalArgumentException("Problème"); //Unchecked
	}
	
	public void dispaly2(double prix) throws Exception
	{
		System.out.println("Prix = "+prix);
		throw new Exception("Problèm"); //checked
	}
	
	public void ConnectBD() throws SQLException
	{
		//connection au serveur BD
	}
	
	public static void division(int a, int b) throws ArithmeticException //Unchecked
	{
		System.out.println("Résultat = "+(a/b));
	}

}
