package day5_06052023;

public class LesTableaux {

	public static void main(String[] args) {
		//int  tab [] = {12,3,6}; //declaration et initialisation
		/*
		int tab[]= new int[3];//declaration et initialisation par des zéro
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		
		tab[0]=12;
		tab[1]=10;
		tab[2]=15;
		for(int i = 0; i<tab.length; i++)
		{
			System.out.println("tab["+i+"] = "+tab[i]);
		}
		System.out.println("******");
		for(int e : tab) //enhanced loop
		{
			System.out.println(e);
		}*/
		
		/*String names[] = {"Affif","Amine","Anoir"};
		String formations[] = new String[4];
		formations[0]="OCA";
		formations[1]="OCP";
		formations[2]="PSM/PSPO";
		formations[3]="CKA/Spring";*/
		/*
		Animal animals[] = new Animal[3];
		animals[0] = new Animal(2,"Toto");
		animals[1] = new Animal(3,"Tata");
		
		for(Animal a : animals)
		{
			System.out.println(a); //a.toString();
		}*/
		
		// Les tableaux à deux dimensions
		
		//int [] tab [];
		//int [][] tab ;
		/*
		int tab[][] = new int[3][4];// initialisation par de zéros
		
		System.out.println(tab.length);
		System.out.println(tab[0].length);
		System.out.println(tab[2][3]);*/
		
		/*String tab[][] = new String[3][4];
		System.out.println(tab[2][2]);*/
		
		/*int tab[][] = new int[3][];
		tab[0]=new int[2];
		tab[1]=new int[4];
		tab[2]=new int[3];*/
		
		int tab[][] = {{10,11},{1,2,3,4},{100,101,102}};
		for(int i = 0; i<tab.length;i++)
		{
			for(int j=0; j<tab[i].length;j++)
			{
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}	
		for(int t[]: tab)
		{
			for(int e : t)
			{
				//System.out.print(e+"\t");
				e=e*2;
				//System.out.print(e+"\t");
			
			}
			System.out.println();
		}
		

	}

}
