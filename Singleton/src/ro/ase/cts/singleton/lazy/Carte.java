package ro.ase.cts.singleton.lazy;

public class Carte {
	private String numeCarte;
	private int numarPagini;
	private double notaRecenzie;
	private static Carte instanta = null;
	
	private Carte(String numeCarte, int numarPagini, double notaRecenzie) {
		super();
		this.numeCarte = numeCarte;
		this.numarPagini = numarPagini;
		this.notaRecenzie = notaRecenzie;
	}
	
	public void setNumeCarte(String numeCarte) {
		this.numeCarte = numeCarte;
	}
	
	public void setNumarPagini(int numarPagini) {
		this.numarPagini = numarPagini;
	}
	
	public void setNotaRecenzie(double notaRecenzie) {
		this.notaRecenzie = notaRecenzie;
	}
	
	public static synchronized Carte getInstanta(String numeCarte, int numarPagini, double notaRecenzie) {
		if(instanta == null) {
			instanta = new Carte(numeCarte,numarPagini,notaRecenzie);
		}
		return instanta;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carte [numeCarte=");
		builder.append(numeCarte);
		builder.append(", numarPagini=");
		builder.append(numarPagini);
		builder.append(", notaRecenzie=");
		builder.append(notaRecenzie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
