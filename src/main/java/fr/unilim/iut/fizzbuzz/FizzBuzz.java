package fr.unilim.iut.fizzbuzz;

import java.util.ArrayList;


public class FizzBuzz{
	

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		
		if(regleFizzBuzz.isVerifieePar(nombre))
			return RegleFizzBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(regleBuzz.isVerifieePar(nombre))
			return RegleBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(isFizz(nombre))
			return "fizz";
		
		return String.valueOf(nombre);
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}