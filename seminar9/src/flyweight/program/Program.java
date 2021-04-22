package flyweight.program;

import flyweight.clase.FlyweightFactory;
import flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1, 5, 5);
		Rezervare rezervare2=new Rezervare(2, 3, 5);
		Rezervare rezervare3=new Rezervare(3, 5, 6);
		
		FlyweightFactory factory=new FlyweightFactory();
		factory.getClient("077123").printeazaRezervare(rezervare1);
		factory.getClient("0789").printeazaRezervare(rezervare2);
		factory.getClient("077123").printeazaRezervare(rezervare3);
		

	}

}
