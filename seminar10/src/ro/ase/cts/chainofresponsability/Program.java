package ro.ase.cts.chainofresponsability;

public class Program {

	public static void main(String[] args) {
		Cont contCurent=new ContCurent(400);
		Cont contEconomii=new ContEconomii(100);
		Cont contCredit=new ContCredit(300);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(50);
		contCurent.plateste(340);
		contCurent.plateste(200);
		contCurent.plateste(200);

	}

}
