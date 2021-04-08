package ro.ase.cts.facadeclase;

public class Politie {
	
	public boolean esteUrmarit(Persoana persoana) {
		return Integer.parseInt(""+persoana.getCNP().charAt(12))%2==0;
	}

}
