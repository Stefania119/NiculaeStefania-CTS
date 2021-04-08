package ro.ase.cts.facadeclase;

public class BirouCredite {
	
	public static boolean areDatorii(Persoana persoana)
	{
		if((Integer.parseInt(""+persoana.getCNP().charAt(12)))%2==0) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
