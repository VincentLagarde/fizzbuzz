package fr.unilim.iut.fizzbuzz;

public class FizzBuzz{
	

	public String donnerLaReponsePour(Integer nombre) {
		String chaine ="";
		
		if (isFizz(nombre))
			chaine = "fizz";
		
		if (isBuzz(nombre))
			chaine += "buzz";
		
		
		if(chaine=="")
			chaine = String.valueOf(nombre);
		
		return chaine;
	}


	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}