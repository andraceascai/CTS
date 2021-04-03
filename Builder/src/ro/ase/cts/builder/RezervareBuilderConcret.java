package ro.ase.cts.builder;

public class RezervareBuilderConcret implements AbstractBuilderRezervare{
	private Rezervare rezervare;
	
	public RezervareBuilderConcret() {
		this.rezervare = new Rezervare(0000, false, false, false, false, "necunoscut");
	}
	
	public RezervareBuilderConcret(int cod) {
		super();
		this.rezervare = new Rezervare(cod, false, false, false, false, "necunoscut");
	}
	
	public RezervareBuilderConcret setCodRezervare(int codRezervare) {
		 rezervare.setCodRezervare(codRezervare);
		 return this;
	}
	public RezervareBuilderConcret setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilderConcret setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilderConcret setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilderConcret setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilderConcret setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	 
}
