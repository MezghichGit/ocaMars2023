package chapitre5_20052023.classeAbstraite;

import java.util.List;

public class FinanceEntreprise {

	public static void main(String[] args) {
		List<Employer>emps;
		//Polymorphisme générique
		Employer employers[] = new Employer[3];  //employers : structure polymorphe
		Employer em = new Directeur(); //upcasting
		em.calculSalaire();
		employers[0]= new Directeur();
		employers[1]= new Manager();
		employers[2]= new RH();
		
		for(Employer emp : employers)
		{
			emp.calculSalaire();
		}

	}

}
