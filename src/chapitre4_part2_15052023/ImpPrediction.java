package chapitre4_part2_15052023;

public class ImpPrediction implements Prediction {

	@Override
	public boolean test(String word) {
		return word.contains("oca");
	}

}
