package day4_15_04_2023.lesDateTime;

public class LesChainesDeCaractères {

	public static void main(String[] args) {
		
		//Le type String est immutable
		String ch = "oca";
		ch.concat("-ocp");
		//ch = ch.concat("-ocp");
		System.out.println(ch);
		
		//Les types StringBuilder et StringBuffer sont mutables
		StringBuilder sb = new StringBuilder("oca");
		sb.append("-ocp");
		System.out.println(sb);

	}

}
