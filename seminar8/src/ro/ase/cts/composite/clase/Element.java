package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu{
	
	String numeElement;
	

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) {
		
		throw new IllegalArgumentException("Nu e implementat");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		
		throw new IllegalArgumentException("Nu e implementat");
		
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		
		throw new IllegalArgumentException("Nu e implementat");
	}

	@Override
	public void printeaza() {
		System.out.println("Nume "+numeElement);
		
	}

}
