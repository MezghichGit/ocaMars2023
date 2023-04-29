package le29042023;

public class Main {

	public static void main(String[] args) {
		/*
		String s1 = "oca"; //literal: Pool
		String s2 =  new String("oca");//Heap
		String s3 =  "oca";
		System.out.println("s1 == s2 : " +(s1 == s2));//false
		System.out.println("s1 == s3 : " +(s1 == s3));
		System.out.println("***");
		System.out.println("s1.equals(s2) : " +s1.equals(s2));//true  // comparaison caractères par caractères
		System.out.println("s1.equals(s3) : " +s1.equals(s3));
		
		//
		StringBuilder sb1 = new StringBuilder("oca");
		StringBuilder sb2 = new StringBuilder("oca");
		
		System.out.println("***");
		System.out.println("sb1 == sb2 : " +(sb1.equals(sb2))); 
		System.out.println("sb1.equals(sb2) : "+sb1.equals(sb2)); // ==
		*/
		/*
		String ch="oca";//Pool; String : Immutable
		ch.concat("-ocp");
		
		System.out.println(ch.concat("-ocp"));
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder("oca"); //StringBuilder : mutable
		sb.append("-ocp");
		System.out.println(sb);*/
		
		/*
		System.out.println("Exemple avec les String");
		String ch="";
		for(char p='a'; p<='z';p++)
		{
			ch=ch+p;
			System.out.println(ch);
			System.out.println(ch.hashCode());
		}
		System.out.println("résultat final :" +ch);
		
		System.out.println("Exemple avec les StringBuilder");
		
		StringBuilder sb = new StringBuilder("");
		for(char p='a'; p<'z';p++)
		{
			sb.append(p);
			System.out.println(sb.hashCode());
			System.out.println(sb);
		}
		System.out.println("résultat final :" +sb);*/
		/*
		String ch="oca-ocp";
		
		StringBuilder sb = new StringBuilder(ch);
		// processing sur le sb...
		
		ch = sb.toString();*/
		/*
		String ch = "ab"+2+3;
		System.out.println(ch);
		
		String ch2 = 2+3+"ab";
		System.out.println(ch2);*/
		
		// String methods
		//1)length()
		String ch="animals";
		System.out.println(ch.length());
		//2)charAt(int position)
		
		System.out.println(ch.charAt(2));
		//3)indexOf("mot");
		System.out.println(ch.indexOf("ma"));
		System.out.println(ch.indexOf("a"));
		//4,5)toUpperCase, toLowerCase;
		System.out.println(ch.toUpperCase());
		//6)substring()
		System.out.println(ch.substring(2,6));
		System.out.println(ch.substring(2));
		//7) contains(mot)
		System.out.println(ch.contains("MA"));
		//8)trim
		String mot =" ab c ";
		System.out.println(mot);
		System.out.println(mot.trim());
		//Exercice  nom = " animals ";
		String ch1 = " animals ";
		ch1 = ch1.trim();
		System.out.println(ch1);
		//System.out.println(ch1.replace("a", "A"));
		//System.out.println(ch1.replace(ch1.charAt(0), 'A'));
		
		ch1= ch1.substring(0,1).toUpperCase()+ch1.substring(1);
		System.out.println(ch1);
	}

}
