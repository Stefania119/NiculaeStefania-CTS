package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private ZooKeeper ingrijitor;
	private List<Animal> animale;
	public Zoo(ZooKeeper ingrijitor, List<Animal> animale) {
		super();
		this.ingrijitor = ingrijitor;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.ingrijitor=new ZooKeeper("Gigel");
		this.animale=new ArrayList<Animal>();
		
	}
	public void addAnimal(Animal a) {
		animale.add(a);
	}
	
	public void feedAllAnimals() {
		for(Animal a:animale) {
			ingrijitor.feed(a);
		}
	}
	
	

}
