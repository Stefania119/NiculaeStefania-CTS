package program;

import clase.Girafe;
import clase.Zoo;

public class Class {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		Girafe girafe=new Girafe("Girafa1");
		Girafe girafe2=new Girafe("Girafa2");
		z.addAnimal(girafe);
		z.addAnimal(girafe2);
		
		z.feedAllAnimals();

	}

}
