package chapitre5_20052023.overriding;

import java.io.IOException;

public class Etudiant extends Personne{
	
	@Override
	public void info() throws Exception{
	//public void info() throws IllegalArgumentException{
		System.out.println("Un etudiant");
	}
	
	@Override
	public Oiseau getData()
	 {
		 return new Oiseau();
	 }
}
