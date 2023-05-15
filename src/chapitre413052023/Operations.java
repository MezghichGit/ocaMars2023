package chapitre413052023;

public class Operations {
	
	// On a une sercharge de la méthode somme
	public static void somme(short x, short y)
	{
		System.out.println("byte x, byte y");
	}
	
	public static void somme(byte x, byte y)
	{
		System.out.println("byte x, byte y");
	}
	
	public static void somme(int x, int y)
	{
		System.out.println("int x, int y");
	}
	public static int somme(byte x, int y)
	{
		System.out.println("int x, int y");return 10;
	}
	
	public static void somme(double x, double y)
	{
		System.out.println("double x, double y");
	}
	
	public static void somme(float x, float y)
	{
		System.out.println("float x, float y");
	}
	
	public static void somme(Integer x, Integer y)
	{
		System.out.println("Integer x, Integer y");
	}
	public static void somme(Double x, Double y)
	{
		System.out.println("Double x, Double y");
	}
	public static void somme(int ... values)
	{
		System.out.println("int ... values");
	}
	
	public static void main(String[] args) {
		//float x = 10.5F;
		/*
		byte x = 10;
		byte y = 10;
		somme(x,y);*/
		somme(10,10);
		//somme(10.5,10.5); //double, double
		//System.out.println(Byte.MAX_VALUE);

	}

}
