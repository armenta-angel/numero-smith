package solveet.aarmenta;

public class NumeroSmith {

	public static boolean esNumeroSmith(int numero) {
		Integer[] descompCanonica = DescomposicionCanonica.descomponer(numero);
		Integer[] descompDigitos = DescomposicionDigitos.descomponer(numero);

		return (suma(descompCanonica) == suma(descompDigitos));
	}

	private static int suma(Integer[] descomposicion) {
		int resultado = 0;

		for (int sumando : descomposicion) {
			if (String.valueOf(sumando).length() > 1) {
				sumando = sumaFactores(sumando);
			}
			resultado += sumando;
		}

		return resultado;
	}

	private static int sumaFactores(int numero) {
		Integer[] descompDigitos = DescomposicionDigitos.descomponer(numero);
		return suma(descompDigitos);
	}

}
