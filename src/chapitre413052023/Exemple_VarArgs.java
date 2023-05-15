package chapitre413052023;

public class Exemple_VarArgs {
	
	public static void somme(int ... values)
	{
		//System.out.println("int ... values");
		int som = 0;
		for(int i =0; i<values.length; i++)
		{
			som = som + values[i];
		}
		System.out.println("Somme = "+som);
	}

	public static void main(String... args) {
		somme();
		somme(10);
		somme(12,4);
		somme(1,2,3,6,8,10);

	}

}
