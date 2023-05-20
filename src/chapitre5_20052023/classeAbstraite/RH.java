package chapitre5_20052023.classeAbstraite;

public class RH extends Employer{
	double prime = 0.2;
	@Override
	public void calculSalaire() {
		System.out.println(salaire + salaire*prime + 50);
	}

}
