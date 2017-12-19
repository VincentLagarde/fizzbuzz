package rules;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzReglesFactory {
	
	public static List<Regle> build() {
		return Arrays.asList(
								new RegleFizzBuzz(),
								new RegleBuzz(),
								new RegleFizz());
	}

}
