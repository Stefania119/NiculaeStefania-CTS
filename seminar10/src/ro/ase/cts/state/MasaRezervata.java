package ro.ase.cts.state;

public class MasaRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaLibera) {
			System.out.println("Masa "+masa.getNrMasa()+" s-a rezervat");
			masa.setStare(this);
			
		}
		else {
			System.out.println("Masa "+masa.getNrMasa()+" e deja rezervata");
		}
		
	}

}
