package chapitre4_part2_15052023.exo1;

import java.util.*;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		Operation op1 = (int a, int b)->{return a+b;}; //expression lambda
		
		System.out.println(op1.calcul(10, 2));
		
		Operation op2 = (int a, int b)->{return a*b;};//lambda expression étendue
		Operation op3 = (a,b)->a*b; //lambda expression réduite(inférence)
		
		System.out.println(op2.calcul(10, 2));
		
		List<String>names = new ArrayList<>();
		names.add("Amine");
		names.add("Aloui");
		names.add("Sonia");
		names.add("Anoir");
		names.add("Wael");
		
		System.out.println(names);
		
		Stream<String> s = names.stream();
		
		s.filter(ch->ch.startsWith("A")).forEach(ch->System.out.println(ch));
		//s.forEach(System.out::println);
		

	}

}
