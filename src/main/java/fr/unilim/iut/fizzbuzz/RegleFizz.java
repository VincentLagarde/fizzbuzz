package fr.unilim.iut.fizzbuzz;

public class RegleFizz {

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}

	public static String valeurAAfficherSiRegleVerifiee() {
		return "fizz";
	}

}
