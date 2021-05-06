package ro.ase.cts.chainofresponsability;

public class ContEconomii extends Cont{

	public ContEconomii(float sold) {
		super(sold);
		
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("Ai platit cu contul de economii");
			super.setSold(super.getSold()-suma);
		}
		else {
			if(super.getSuccesor()==null) {
				System.out.println("Nu se poate plati");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		
	}

	}}
