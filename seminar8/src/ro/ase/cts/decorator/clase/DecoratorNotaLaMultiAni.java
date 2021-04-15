package ro.ase.cts.decorator.clase;

public class DecoratorNotaLaMultiAni extends DecoratorAbstract{

	public DecoratorNotaLaMultiAni(NotaAbstracta notaAbstracta) {
		super(notaAbstracta);
		
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare-La multi ani,la multi bani!");
		
	}
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
	
	

}
