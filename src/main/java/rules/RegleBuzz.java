package rules;

public class RegleBuzz implements Regle{

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % 5;

	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "buzz";
	}

}
