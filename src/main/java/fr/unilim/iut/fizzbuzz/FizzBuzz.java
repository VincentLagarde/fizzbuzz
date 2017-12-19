package fr.unilim.iut.fizzbuzz;

import java.util.ArrayList;


public class FizzBuzz{
	

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		
		if(regleFizzBuzz.isVerifieePar(nombre))
			return RegleFizzBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(isBuzz(nombre))
			return "buzz";
		
		if(isFizz(nombre))
			return "fizz";
		
		return String.valueOf(nombre);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}