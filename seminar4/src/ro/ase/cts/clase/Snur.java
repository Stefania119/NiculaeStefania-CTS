package ro.ase.cts.clase;

public class Snur {

	private String firma;
	private float greutate;
	private int id;
	private static Snur snur = null;

	private Snur(String firma, float greutate, int id) {

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
		builder.append("Snur [firma=");
		builder.append(firma);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	public static synchronized Snur getInstance(String firma, float greutate, int id) {
		if (snur == null) {
			snur = new Snur(firma, greutate, id);
		}
		return snur;
	}

}
