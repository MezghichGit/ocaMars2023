package chapitre5_20052023.classeAbstraite;

public class Directeur extends Employer{
	int anne;
	double prime = 0.8;
	
	@Override
	public void calculSalaire() {
		System.out.println(salaire + salaire*prime);
	}

}
