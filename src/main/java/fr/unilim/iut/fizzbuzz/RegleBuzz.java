package fr.unilim.iut.fizzbuzz;

public class RegleBuzz {

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % 5;

	}

	public static String valeurAAfficherSiRegleVerifiee() {
		return "buzz";
	}

}
