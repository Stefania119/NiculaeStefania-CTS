package ro.ase.cts.simplefactory.clase;

import ro.ase.cts.simplefactory.clase.Asistent;
import ro.ase.cts.simplefactory.clase.Brancardier;
import ro.ase.cts.simplefactory.clase.Medic;
import ro.ase.cts.simplefactory.clase.PersonalSpital;

public class FactoryPersonal {

	
	public ro.ase.cts.simplefactory.clase.PersonalSpital getPersonal(TipPersonal tipPersonal,String nume) throws Exception {
		switch(tipPersonal) {
		case MEDIC:{Medic medic=new Medic(nume);
		return medic;}
		case ASISTENT:{
			Asistent asistent=new Asistent(nume);
			return asistent;
		}
		case BRANCARDIER:{
			return new Brancardier(nume);
			
		}default:throw new Exception();
		
		}
	}
}
