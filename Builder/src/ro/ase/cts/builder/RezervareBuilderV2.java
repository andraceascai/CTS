package ro.ase.cts.builder;

public class RezervareBuilderV2 implements AbstractBuilderRezervare{
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	private Rezervare rezervare;
	
	public RezervareBuilderV2() {
		this.codRezervare = 0000;
		this.areMancareInclusa = false;
		this.areBauturaInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = "";
	}
	
	public RezervareBuilderV2(int cod) {
		super();
		this.rezervare = new Rezervare(cod, false, false, false, false, "necunoscut");
	}
	
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		 rezervare.setCodRezervare(codRezervare);
		 return this;
	}
	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
	}

}
