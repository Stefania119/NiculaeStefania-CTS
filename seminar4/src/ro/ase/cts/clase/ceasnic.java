package ro.ase.cts.clase;

public class ceasnic {
	
	private String firma;
	private float greutate;
	private int id;
	private static ceasnic ceasnic1=null;
	private ceasnic(String firma, float greutate, int id) {
		super();
		this.firma = firma;
		this.greutate = greutate;
		this.id = id;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ceasnic [firma=");
		builder.append(firma);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	 public static synchronized ceasnic getInstance(String firma,float greutate,int id) {
	    	if(ceasnic1==null)
	    		{ceasnic1=new ceasnic(firma,greutate,id);}
	    	return ceasnic1;
	    }
	
	


}
