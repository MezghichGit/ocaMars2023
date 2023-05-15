package chapitre4_part2_15052023;

public class Main {

	public static void main(String[] args) {
		/*
		ImpPrediction imp = new ImpPrediction();
		System.out.println(imp.test("java oca"));
		System.out.println(imp.test("java ocp"));*/
		
		Prediction pred = (String w)->{return w.contains("oca");};
		System.out.println(pred.test("java oca"));

	}

}
