package fr.unilim.iut.fizzbuzz;

public class RegleFizzBuzz {

	public boolean isVerifieePar(Integer nombre) {
		return 0 == nombre % (3*5);
	}

	public static String valeurAAfficherSiRegleVerifiee() {
		return "fizzbuzz";
	}
	



}
