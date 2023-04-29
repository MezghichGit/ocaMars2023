package le29042023;

public class LesStringBuilder {

	public static void main(String[] args) {
		// Not thread Safe : fast
	/*
		StringBuilder sb = new StringBuilder(); // capacity initiale = 16
		
		//System.out.println(sb.length()); //0
		//System.out.println(sb.capacity());  //16
		
		sb.append("oca");
		
		//System.out.println(sb.length()); //3
		//System.out.println(sb.capacity());  //16
		
		sb.append("ocaocaocaoca");
		
		//System.out.println(sb.length()); //15
		//System.out.println(sb.capacity());  //16
		
		sb.append("ab");
		System.out.println(sb.length()); //17
		System.out.println(sb.capacity());  //34
		
		sb.append("aaaaaaaaaaaaaaaaac");
		System.out.println(sb.length()); //34
		System.out.println(sb.capacity()); //34
		
		*/
		
		StringBuffer s = new StringBuffer("oca");  //Thread safe : slow
		s.append("-ocp");
		System.out.println(s);
		

	}

}
