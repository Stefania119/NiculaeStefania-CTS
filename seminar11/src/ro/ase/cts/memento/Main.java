package ro.ase.cts.memento;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci1=new MeciJucat("echipa1", "echipa2", 100, 100, 50, 10);
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(meci1.creareMemento());
		meci1.setNumeGazda("echipa3");
		meci1.setNrSpectatori(30);
		meci1.setNumeOaspeti("echipa4");
		
		
		manager.adaugaMemento(meci1.creareMemento());

		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
	}

}
