package chapitre5_20052023.polymorphisme;

public class Application {

	public static void main(String[] args) {
		//1) polymorphisme d'hériatge
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		//a=o; // upcasting OK
		//o=a;
		
		//a=o;
		//o = a;  //downcating  KO
		//o = (Oiseau) a;  //downcating  + cast explicite : Exception
		
		Oiseau o2 = new Oiseau(); 
		a = o2; //upcasting
		o = (Oiseau) a; //downcating  + cast explicite + up cast
		System.out.println("fin du programme...");
		
		
		

	}

}
