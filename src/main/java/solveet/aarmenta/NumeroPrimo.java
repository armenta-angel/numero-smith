package solveet.aarmenta;

public class NumeroPrimo {

	public static boolean esPrimo(int numero) {
		boolean resultado = true;

		if (numero <= 1) {
			resultado = false;
			
		} if (numero > 1) {
			int divisor = numero - 1;
			do {							
				if (divisor > 1 && numero % divisor == 0) {
					resultado = false;
				}
				divisor--;
			} while (divisor > 1 && resultado);		
		}
		
		return resultado;
	}

	public static int siguientePrimo(int primoDePartida) {
		int candidatoPrimo = primoDePartida + 1;

		while (esPrimo(candidatoPrimo) == false) {
			candidatoPrimo++;
		}

		return candidatoPrimo;
	}

}
