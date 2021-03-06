package ro.ase.cts.programe;


import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.ReaderAngajat;
import ro.ase.cts.clase.readers.ReaderElev;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = ReaderElev.readPupil("elevi.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
