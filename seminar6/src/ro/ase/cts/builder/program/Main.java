package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		Rezervare r1=new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		
		Rezervare r2=new RezervareBuilder().setCodRezervare(20).setAreMuzicaAmbientala(true).setGenMuzica("Manele").build();
		
		Rezervare r3=new Rezervare(false,true,false,false,null,70);
		
		RezervareBuilder newBuilder=new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare r4=newBuilder.setCodRezervare(80).build();
		Rezervare r5=newBuilder.setCodRezervare(81).build();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString());
	}

}
