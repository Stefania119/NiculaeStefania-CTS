package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.LazyBrokerTranzactie;
import ro.ase.cts.clase.Snur;
import ro.ase.cts.clase.ceasnic;

public class Main {

	
	public static void main(String[] args) {
		BrokerTranzactie broker1=BrokerTranzactie.getInstance();
		BrokerTranzactie broker2=BrokerTranzactie.getInstance();
		System.out.println(broker1);
		System.out.println(broker2);
		
		broker1.setName("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		System.out.println(broker1);
		System.out.println(broker2);
		
		LazyBrokerTranzactie lazy1=LazyBrokerTranzactie.getInstance("Marcel", 2, 100);
		LazyBrokerTranzactie lazy2=LazyBrokerTranzactie.getInstance("Bianca", 2, 100);
		System.out.println(lazy1);
		System.out.println(lazy2);
		
		Snur snur1=Snur.getInstance("A", 2, 5);
		Snur snur2=Snur.getInstance("B", 3, 1);
		System.out.println(snur1);
		System.out.println(snur2);
		
		
	}
}
