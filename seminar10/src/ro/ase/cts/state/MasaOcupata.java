package ro.ase.cts.state;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata) {
			System.out.println("nu se poate ocupa");
		}
		else {
			masa.setStare(this);
			System.out.println("Masa cu nr "+masa.getNrMasa()+" este ocupata");
		}
		
	}

}
