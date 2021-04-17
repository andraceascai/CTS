package ro.ase.cts.flyweight;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private String orRezeravre;
	
	public Rezervare(int nrMasa, int nrPersoane, String orRezeravre) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.orRezeravre = orRezeravre;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", orRezeravre=");
		builder.append(orRezeravre);
		builder.append("]");
		return builder.toString();
	}
	
}
