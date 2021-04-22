package strategy.clase;

public class Client {
	private String nume;
	private Strategy strategy;
	public Client(String nume) {
		super();
		this.nume = nume;
		this.strategy = new Card();
	}
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	public void platesteNota(double suma) {
		System.out.println("Clientul "+nume+" are de plata nota cu suma de "+suma);
		strategy.realizeazaPlata(suma);
	}
	

}
