package chapitre4_part2_15052023;

public class Calculatrice implements Calcul{

	@Override
	public void operation() {
		System.out.println("Hello");
		
	}
	
	public static void  test() {}
	
	@Override
	public  void info() {
		System.out.println("overriden method");
	}

}
