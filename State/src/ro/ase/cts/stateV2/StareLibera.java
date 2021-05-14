package ro.ase.cts.stateV2;

public class StareLibera implements State {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			System.out.println("Masa cu codul " + masa.getCod() + " este eliberata.");
			masa.setStare(this);
		}else {
			System.out.println("Masa este deja libera sau nu poate fi eliberata.");
		}

	}

}
