package chapitre4_part2_15052023;

public class Etudiant extends Personne{

	@Override  // redefinition
	protected void display() {
		super.display();
		System.out.println("Un(e) étudiant(e)");
	}
}
