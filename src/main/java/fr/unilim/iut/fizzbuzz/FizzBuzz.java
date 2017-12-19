package fr.unilim.iut.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import rules.FizzBuzzReglesFactory;
import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;



public class FizzBuzz{
	
	List<Regle> regles;

	public FizzBuzz(){
		this(FizzBuzzReglesFactory.build());
	}
	
	public FizzBuzz(List<Regle> regles){
		this.regles = regles;
	}

	public String donnerLaReponsePour(Integer nombre) {
		
		for(Regle regle : regles){
			if(regle.isVerifieePar(nombre)){
				return regle.valeurAAfficherSiRegleVerifiee();
			}
		}
		
		return String.valueOf(nombre);
	}

}