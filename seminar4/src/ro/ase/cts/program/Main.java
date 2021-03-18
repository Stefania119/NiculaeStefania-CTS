package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.LazyBrokerTranzactie;

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
		
	}
}
