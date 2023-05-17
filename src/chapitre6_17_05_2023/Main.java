package chapitre6_17_05_2023;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args)  throws SQLException, IOException{
		int x = 10;
		int y = 10;
		try {
		System.out.println(x/y);
		int tab[]= {10,2,4};
		return;
		//System.out.println(tab[3]);
		
		}
		catch(ArithmeticException e)  //exception spécifique
		{
			System.out.println("Problème 1..." + e.getMessage());
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)  //exception spécifique
		{
			System.out.println("Problème 2..." + e.getMessage());
			e.printStackTrace();
			
		}
		catch(RuntimeException e)// exception générale
		{
			System.out.println("Problème 3..." + e.getMessage());
			e.printStackTrace();
			
		}
		
		catch(Exception e)// exception générale
		{
			System.out.println("Problème 4..." + e.getMessage());
			e.printStackTrace();
		}
		
		//int tab[]= {10,2,4};
		//System.out.println(tab[2]);
		//System.out.println(tab[3]);
		//String formation=null;
		//System.out.println(formation.length());
		/*
		String ch = "OCA";
		Object o = ch;
		Integer nbr = (Integer)o;*/
		finally {
		System.out.println("Suite du programme...");
		}

	}

}
