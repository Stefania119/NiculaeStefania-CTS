package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	
	private List<ComponentaMeniu> componente;
	private String numeSectiune;
	public Sectiune( String numeSectiune) {
		super();
		this.componente = new ArrayList<ComponentaMeniu>();
		this.numeSectiune = numeSectiune;
	}
	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) {
		componente.add(componentaMeniu);
		
	}
	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		componente.remove(componentaMeniu);
		
	}
	@Override
	public ComponentaMeniu getNod(int index) {
		
		if(index<componente.size()&&index>=0)
		{return componente.get(index);}
		else
			{return null;}
	}
	@Override
	public void printeaza() {
		System.out.println("Sectiune "+numeSectiune+" ");
		for(ComponentaMeniu componenta:componente)
		{
			componenta.printeaza();
		}
		
		
	}
	
	
	

}
