//Restaurantul doreste implementarea unui modul pentru gestiunea modului de ocupare almeselor
//O masa poate sa aiba urmatoarele stari: Rezervata, Ocupata, Libera.
//Atunci cand clientul face o rezervare  masa trece in starea Rezervata. Cand clientul ridica rezervarea
//masa trece in starea ocupata, iar cand pleaca, masa trece in satrea libera.

package ro.ase.cts.state.main;

import ro.ase.cts.state.Masa;

public class Main {

	public static void main(String[] args) {
		
		Masa masa = new Masa(1610);
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasaRezervata();
		masa.elibereazaMasa();
		
	}

}
