package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String, Flyweight> clienti;

	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<String, Flyweight>();
	}
	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight=clienti.get(nrTelefon);
		if(flyweight==null) {
			flyweight=new Client("Ana", nrTelefon, "ana@mail.com");
			clienti.put(nrTelefon, flyweight);
		}
		return flyweight;
	}
	

}
