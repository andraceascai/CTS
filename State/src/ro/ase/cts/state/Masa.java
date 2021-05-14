package ro.ase.cts.state;

public class Masa {
	
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StareLibera(); //starea default cand cream o masa
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul " + cod + " a fost rezervata cu succes!");
			this.stare = new StareRezervata();
		}
		else {
			System.out.println("Masa nu poate fi rezervata!");
		}
	}
	
	public void ocupaMasaRezervata() {
		if(this.stare instanceof StareRezervata) {
			System.out.println("Masa cu codul " + cod + " a fost ocupata cu succes!");
			this.stare = new StareOcupata();
		}else {
			System.out.println("Masa nu poate fi ocupata. Nu aveti o rezervare");
		}
	}
	
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul " + cod + " a fost ocupata cu succes!");
			this.stare = new StareOcupata();
		}else {
			System.out.println("Masa nu poate fi ocupata!");
		}
	}
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof StareLibera)) {
			System.out.println("Masa cu codul " + cod + " a fost eliberata cu succes!");	
			this.stare = new StareLibera();
		}else {
			System.out.println("Masa este deja libera");
		}
	}
}
