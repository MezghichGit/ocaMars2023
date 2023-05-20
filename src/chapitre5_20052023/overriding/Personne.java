package chapitre5_20052023.overriding;

public class Personne {
	
	 void info() throws Exception{
	//void info(){
		System.out.println("Une personne");
	}
	 
	 public Animal getData()
	 {
		 return new Animal();
	 }

}
