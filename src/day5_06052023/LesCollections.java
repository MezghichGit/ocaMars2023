package day5_06052023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LesCollections {

	public static void main(String[] args) {
		//List l1 = new ArrayList();
		//List l2 = new LinkedList();
		
		//l1.add("oca");
		//l2.add("oca");
		/*
		ArrayList l = new ArrayList();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.add("oca");
		l.add("ocp");
		l.add(true);
		l.add(12);
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		System.out.println(l);
		l.clear(); //vider la liste
		System.out.println(l);*/
		
		ArrayList<String> l = new ArrayList<>();
		
		List<String> l2 = new ArrayList<>();
		//List l2 = new ArrayList();
		l.add("oca");
		l.add("ocp");
		l.add("spring");
		l.add("11");//int
		l.add("a"); //char
		for(Object o : l)
		{
			String temp = (String)o;
			System.out.println(temp.length());
		}
		
		//System.out.println(l);
		//System.out.println(l.contains("ocp11"));
	}

}
