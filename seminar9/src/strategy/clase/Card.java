package strategy.clase;

public class Card implements Strategy{

	@Override
	public void realizeazaPlata(double suma) {
		System.out.println("A fost facuta plata cu cardul in valoare de "+suma);
		
	}

}
