package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements NotaAbstracta{
	private NotaAbstracta notaAbstracta;

	
	public DecoratorAbstract(NotaAbstracta notaAbstracta) {
		super();
		this.notaAbstracta = notaAbstracta;
	}


	@Override
	public void printeaza() {
		notaAbstracta.printeaza();
		
	}
	

	public abstract void printeazaFelicitare();
}
