package fr.unilim.iut.fizzbuzz;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzz{
	
	Regle regleFizzBuzz = new RegleFizzBuzz();
	Regle regleBuzz = new RegleBuzz();
	Regle regleFizz = new RegleFizz();

	public String donnerLaReponsePour(Integer nombre) {
		
		if(regleFizzBuzz.isVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(regleBuzz.isVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();
		
		if(regleFizz.isVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee();
		
		
		return String.valueOf(nombre);
	}

}