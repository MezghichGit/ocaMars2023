package chapitre6_17_05_2023;

import java.io.IOException;
import java.sql.SQLException;

public class Calcul {

	public static void info() throws SQLException, Exception //we declare checked exception
	{
		System.out.println("Hello OCP");
		throw new SQLException("Une exception vérifié");
	}
	
	public static void info2() throws RuntimeException //we declare unchecked exception
	{
		System.out.println("Hello OCP");
		throw new RuntimeException("Une exception non vérifiée");
	}
	public static void main(String[] args) throws Exception {
		info();
		/*try {
			info();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
		    info2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Suite du programme");
	}

}
