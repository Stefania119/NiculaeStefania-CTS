package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		ContClient c1=new ContClient("Aurica",22,1);
		ContClient c2=(ContClient)c1.copiaza();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		Bilet bilet=new Bilet(1,"Echipa1","Echipa2","1aprilie 2021");
		Bilet bilet1=(Bilet) bilet.copiaza();
		bilet1.setCodBilet(1);
		Bilet bilet2=(Bilet)bilet.copiaza();
		bilet2.setCodBilet(2);
		
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		

	}

}
