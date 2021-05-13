package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	
	private List<Memento> mementos=new ArrayList<Memento>();
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	public Memento getMemento(int index) {
		if(index>=0&&index<mementos.size())
		   return mementos.get(index);
		else
			throw new IllegalArgumentException();
	}
}
