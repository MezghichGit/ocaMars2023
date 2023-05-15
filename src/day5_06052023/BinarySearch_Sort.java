package day5_06052023;

import java.util.Arrays;

public class BinarySearch_Sort {

	public static void main(String[] args) {
		/*int tab[] = {10,5,3,18,4};
		Arrays.sort(tab);
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}*/
		/*
		Etudiant students[] = { new Etudiant("AB",22,14),
								new Etudiant("BC",24,18),
								new Etudiant("AA",23,13)
								};
		
		Arrays.sort(students);
		for(Etudiant e : students)
		{
			System.out.println(e);
		}
		*/
		
		//int tab[] = {4,12,20,30};
		int tab[] = {4,12,2,3};
		System.out.println(Arrays.binarySearch(tab, 2));
	}

}
