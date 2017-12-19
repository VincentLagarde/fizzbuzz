package rules;

public class RegleFizzBuzzBang implements Regle {

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % (3*5*7);
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "fizzbuzzbang";
	}

}
