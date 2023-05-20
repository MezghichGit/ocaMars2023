package chapitre5_20052023.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		Predicate<String> predicate = (String s)->{return s.contains("o");};
		
		ArrayList<String> names = new ArrayList<>();
		names.add("amine");
		names.add("oussema");
		names.add("ali");
		names.add("othmen");
		System.out.println(names);
		//names.removeIf(predicate);
		//names.removeIf(x->x.contains("o"));
		names.removeIf(x->x.startsWith("a"));
		System.out.println(names);

	}

}
