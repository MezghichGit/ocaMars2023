package chapitre6_17_05_2023;

public class Application {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(RuntimeException e)
		{
		System.out.println("Oups "+e.getMessage());
		}
		/*catch(Exception e)
		{
			
		}
		finally {
			System.out.println("suite du programme");
		}*/

	}

}
