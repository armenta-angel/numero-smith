package solveet.aarmenta;

import java.util.ArrayList;
import java.util.List;

public class DescomposicionDigitos {

	public static Integer[] descomponer(int numero) {
		List<Integer> resultado = new ArrayList<Integer>();
		String numeroToString = String.valueOf(numero);

		for (int i = 0; i < numeroToString.length(); i++) {
			resultado.add(Integer.valueOf(numeroToString.substring(i, i + 1)));
		}

		return resultado.toArray(new Integer[resultado.size()]);
	}
}
