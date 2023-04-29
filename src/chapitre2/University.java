package chapitre2;


import java.util.*;
import java.util.Scanner;
import chapitre1.Etudiant;
/*
import chapitre3.A;
import chapitre3.B;
import chapitre3.C;*/
  // il va charger seulement les classes que vous utiliser
import chapitre4.*;
import chapitre4.A;

//import chapitre3.Calcul;
import static chapitre3.Calcul.pi;
import static chapitre3.Calcul.getPi;
import static chapitre3.Calcul.*;
public class University {
	
	public static void main(String args[])
	{
		int x=1;
		System.out.println(x);
		
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Olivier",22);
		//System.out.println(Calcul.pi);
		//Calcul.getPi();
		
		System.out.println(pi);
		getPi();
		
		/*
		Date date;
		Etudiant e1 = new Etudiant();
		System.out.println("Hello Java");
		Scanner sc = new Scanner(System.in);
		A a = new A();
		B b = new B();
		C c = new C();
		//E e = new E();
		
		G g = new G();
		H h = new H();*/
		
	}

}
