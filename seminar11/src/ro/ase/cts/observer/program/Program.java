package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("Infinity");
		Observer c1=new Client("Alin");
		Observer c2=new Client("Maria");
		Observer c3=new Client("Ion");
		managerSala.adaugareAbonat(c1);
		managerSala.adaugareAbonat(c2);
		managerSala.adaugareAbonat(c3);
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.stergeAbonat(c2);
		managerSala.trimiteAnuntImportant("Handbal");

	}

}
