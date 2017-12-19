package rules;

public class RegleBang implements Regle {

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % 7;
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "bang";
	}

}
