package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	
	private OperatorRezervari operator;
	private int nrMinimPersoane;

	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}

	@Override
	public void realizaeazaRezervare(String numeClient, int nrPersoane) {
		if(nrPersoane >= nrMinimPersoane) {
			operator.realizaeazaRezervare(numeClient, nrPersoane);
		}else {
			System.out.println("Veniti direct fara rezevare!");
		}
	}
}
