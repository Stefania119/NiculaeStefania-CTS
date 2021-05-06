package ro.ase.cts.state;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof MasaLibera))
		{
			System.out.println("Masa "+masa.getNrMasa()+" trece in stare libera");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getNrMasa()+" e deja libera");
		}
		
	}

}
