package ro.ase.cts.clase;

public class LazyBrokerTranzactie {

	
	private String name;
    private int vechime;
    private int nrTranzactiiEfectuate;
    private static LazyBrokerTranzactie broker=null;
	private LazyBrokerTranzactie(String name, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.name = name;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LazyBrokerTranzactie [name=");
		builder.append(name);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
    public static synchronized LazyBrokerTranzactie getInstance(String name,int vechime,int nrTranzactii) {
    	if(broker==null)
    		{broker=new LazyBrokerTranzactie(name,vechime,nrTranzactii);}
    	return broker;
    }
    
}
