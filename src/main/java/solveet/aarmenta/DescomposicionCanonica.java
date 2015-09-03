package solveet.aarmenta;

import java.util.ArrayList;
import java.util.List;

public class DescomposicionCanonica {

	public static Integer[] descomponer(int numero) {
		List<Integer> resultado = new ArrayList<Integer>();

		if (numero == 0) {
			resultado.add(new Integer(0));
		}

		if (numero == 1) {
			resultado.add(new Integer(1));
		}
		
		if (numero > 1) {
			int primo = NumeroPrimo.siguientePrimo(1);
			int resto = numero;
			
			do {
				if (resto % primo == 0) {
					resultado.add(new Integer(primo));
					resto = resto/primo;
				} else {
					primo = NumeroPrimo.siguientePrimo(primo);
				}
			} while (resto > 1);
		}

		return resultado.toArray(new Integer[resultado.size()]);
	}
}
