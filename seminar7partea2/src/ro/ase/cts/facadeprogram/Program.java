package ro.ase.cts.facadeprogram;

import ro.ase.cts.facadeclase.Facade;
import ro.ase.cts.facadeclase.Persoana;

public class Program {
	
	public static void main(String[] args) {
		Persoana persoana=new Persoana("2991003440011", "Stefi");
		if(Facade.esteEligibil(persoana))
			System.out.println("Oferim credit");
		else {
			System.out.println("Nu oferim credit");
		}
	}

}
