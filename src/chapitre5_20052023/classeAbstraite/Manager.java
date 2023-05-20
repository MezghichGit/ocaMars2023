package chapitre5_20052023.classeAbstraite;

public class Manager extends Employer{
	double prime = 0.4;
	@Override
	public void calculSalaire() {
		System.out.println(salaire + salaire*prime+100);
	}

}
