package solveet.aarmenta;

public class Utils {
	
	public static String descomposicionToString(Integer[] descomposicion) {
		String resultado = "";

		for (Integer primo : descomposicion) {
			resultado += primo + ",";
		}

		resultado = resultado.substring(0, resultado.length() - 1);

		return resultado;
	}
}
