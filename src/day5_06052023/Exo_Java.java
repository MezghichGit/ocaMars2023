package day5_06052023;

public class Exo_Java {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("");
		sb2.append("Java");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		String str1="Java";
		String str2[] = {"J","a","v","a"};
		String str3="";
		for(String str:str2)
		{
			str3 = str3+str;
		}
		System.out.println(str3);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

	}

}
