package clase;

public class ZooKeeper {
private String nume;

public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public ZooKeeper(String nume) {
	super();
	this.nume = nume;
}
public void feed(Animal a) {
	System.out.println(nume+"feeds the animal");
}
}
