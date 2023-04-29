package chapter2_09042023;

public class LesOperateurs {

	public static void main(String[] args) {
		// Unary operators
		/*
		int x = 10;
		//int y = ++x; // pre-increment
		//int y = --x;   // pre-decrement
		int y = x++; // pre-increment
		//int y = x--;   // pre-decrement
		
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		int z = 0;
		//System.out.println(++z);//1
		System.out.println(z++);//0
		System.out.println(z);
		//String ch = "OCA"+2023;
		//System.out.println(ch);
		
		//int k = ++x -2*y + --y+4*z + ++z;*/
		/*
		boolean res = true;
		boolean inv = !res;
		System.out.println(inv);*/
		
		//2) L'operateur ternaire
		/*
		double salaire = 1700;
		
		int res = (salaire>1500)?2200:1800;
		System.out.println(res);
		
		System.out.println((salaire>1500)?2200:"salaire faible");
		//Test ternaire imbriqué
		int prime = (salaire>1500)?(salaire<1800)?100:150:200;
		System.out.println(prime);
		*/
		/*
		double salaire = 2500;
		int prime = (salaire>2000)?(salaire<2600)?400:350:450;
		System.out.println(prime);*/
		
		// 3) Les opérateurs binaires logiques
		// Opérateur AND
		/*
		int x = 10;
		int y = 20;
		//boolean res= (x<2) && (++y>10);  // AND courcircuit
		boolean res= (x<2) & (++y>10);  // AND
		System.out.println(res);
		System.out.println(y);
		*/
		// Opérateur OR
		/*
		int x = 10;
		int y = 20;
		//boolean res= (x>2) || (++y>10);  // OR courcircuit
		boolean res= (x>2) | (++y>10);  // OR
		System.out.println(res);
		System.out.println(y);*/
		
		//4)Compound assignment operators
		/*
		int x = 10;
		//int y = 1;
		int y=2;
		
		y*=x; // y = y * x;
		System.out.println(y);*/
		//////////////////////
		/*byte x = 10;
		byte y = 120;
		double z = x+y;*/
		
		/*long x = 10;
		int y = (int)(2*x);*/
		
		/*int y = 4;
		double x = 3 + 2 * y--;
		System.out.println(x);
		System.out.println(y);*/
		
		int y = 4;
		//double x = 3 + 2 * y-- + 2*++y + y;
		double x = 3 + 2 * y-- + 2*y++ + y;
		System.out.println(x);
		System.out.println(y);
		
		
		//int x = 2 * 5 + 3 * 4 - 8;
		
		//int x = 2 * ((5 + 3) * 4 - 8);
		//System.out.println(x);
		
		
	}

}
