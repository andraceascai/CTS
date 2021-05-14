//aceeasi cerinta state

package ro.ase.cts.stateV2.main;

import ro.ase.cts.stateV2.Masa;
//import ro.ase.cts.stateV2.StareLibera;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1610);
		masa.ocupaMasa();
		masa.rezervaMasa();
		//masa.setStare(new StareLibera());
		//masa.rezervaMasa();
		masa.elibereazaMasa();

	}

}
