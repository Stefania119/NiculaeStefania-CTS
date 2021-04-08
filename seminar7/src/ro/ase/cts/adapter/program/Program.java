package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdaptorCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Program {
	
	public static void afisazaInfoCredit(CreditAbstract credit,float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		

		Leasing leasing=new Leasing(100, "Ion");
		AdaptorCreditObiecte adaptor=new AdaptorCreditObiecte(leasing);
		afisazaInfoCredit(adaptor, leasing.getSuma());
	}

}
