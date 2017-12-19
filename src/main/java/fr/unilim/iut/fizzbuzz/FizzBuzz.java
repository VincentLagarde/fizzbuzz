package fr.unilim.iut.fizzbuzz;

import java.util.ArrayList;


public class FizzBuzz{
	

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		RegleFizz regleFizz = new RegleFizz();
		
		if(regleFizzBuzz.isVerifieePar(nombre))
			return RegleFizzBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(regleBuzz.isVerifieePar(nombre))
			return RegleBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(regleFizz.isVerifieePar(nombre))
			return RegleFizz.valeurAAfficherSiRegleVerifiee();
		
		
		return String.valueOf(nombre);
	}

}