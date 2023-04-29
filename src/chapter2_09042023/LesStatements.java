package chapter2_09042023;

public class LesStatements {

	public static void main(String[] args) {
		//1)break
		/*
		for(int i = 0; i<10; i++)
		{
			if(i==5) break;
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme");*/
		
		//2)continue
		/*
		for(int i = 0; i<10; i++)
		{
			if(i==5) continue;
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme");*/
		
		//3)Notion de label
		/*
		outer:for(int i = 0; i<10; i++)
		{
			inner:for(int j=0; j<10;j++)
			{
				//if(j==5) break outer;// sortir du programme
				if(j==5) continue outer;// sortir du programme
				System.out.println("(i,j) = ("+i+","+j+")");
			}
			
			
		}
		
		System.out.println("Fin du programme");*/
		
		//4)classic vs Enhanced loop
		
		int tab[] = {10,20,30};
		
		for(int i = 0; i<tab.length; i++)
		{
			System.out.println(tab[i]);
		}
		
		for(int e:tab)
		{
			System.out.println(e);
		}
		
		String[] names = {"Anoir","Sonia","Lassaad","Heni","Wael"};
		for(String name : names)
		{
			System.out.print(name+"\t");
		}

	}

}
