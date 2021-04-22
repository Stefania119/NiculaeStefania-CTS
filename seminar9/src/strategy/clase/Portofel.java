package strategy.clase;

public class Portofel implements Strategy{
	
	double sumaDisponibila;
	

	public Portofel(double sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}


	@Override
	public void realizeazaPlata(double suma) {
		if(sumaDisponibila>=suma) {
		System.out.println("A fost facuta plata din portofel cu suma "+suma);
		sumaDisponibila=sumaDisponibila-suma;
		}else
		{
			System.out.println("Fonduri insuficiente");
		}
	}

}
