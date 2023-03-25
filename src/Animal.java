
public class Animal {

	static int maxAge = 120;
	int age; //attribut d'instance
	String espece; //attribut d'instance

	public Animal() {
		this.age=1;
		int x = 10;
		System.out.println("Constructeur");
	}

	// bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'instance 1, Loading data...");
		System.out.println("Bloc d'instance 1");
	}

	// bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'instance 2");
	}
	
	static {  // bloc de classe
		System.out.println("Bloc de classe");
	}

}
