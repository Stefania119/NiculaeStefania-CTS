package strategy.program;

import strategy.clase.Card;
import strategy.clase.Client;
import strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		
		Portofel portofel=new Portofel(300);
		Client client=new Client("Stef");
		client.setStrategy(portofel);
		client.platesteNota(200);
		client.setStrategy(new Card());
		
		client.platesteNota(110);
		client.setStrategy(portofel);
		client.platesteNota(200);

	}

}
