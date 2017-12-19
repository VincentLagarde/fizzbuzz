package fr.unilim.iut.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzz{
	
	List<Regle> regles = Arrays.asList(
							new RegleFizzBuzz(),
							new RegleBuzz(),
							new RegleFizz());
			

	public String donnerLaReponsePour(Integer nombre) {
		
		for(Regle regle : regles){
			if(regle.isVerifieePar(nombre)){
				return regle.valeurAAfficherSiRegleVerifiee();
			}
		}
		
		return String.valueOf(nombre);
	}

}