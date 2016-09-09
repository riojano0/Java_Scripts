package soluciones;

import java.math.BigInteger;

/* Explicar y fundamentar */

/* Lo que hacia originalmente es tomar un valor
 * y "multiplicar" su string una cantidad de veces ese valor
 * como el ejemplo de al ingresar 5 se obtenia 55555 y se
 * sacaba le modulo de ese valor por 2017 que da 1096
 * Estos valores estaban en un array el cual recorria
 */

/* Como manejo poco Java lo primero que hice fue transcribir la funcion
 * compute en Python y ver como era posible obtener ese mismo valor
 * a partir de numeros menores, lo que vi es que si sacaba el modulo
 * del numero ingresado y ese era el que multiplicaba el string
 * me devolveria el mismo valor sin generar el problema
 * de exceder memoria.
 * Las dificultades fue transcribir la funcion sencilla de Python
 * 
 * for i in values:
	print int((i%2017)*str(i))%2017
	
	a java teniendo que declarar mas variables al conocer poco-nada de 
	este lenguaje. Ademas de todas las conversiones de tipo de variables. 
 */

public class Puzzle_solucion {

	final static BigInteger M = new BigInteger("2017");

	private static BigInteger compute(long n){
		String s = String.valueOf(n);
		int x = (int) (n%2017);
		String z = new String(new char[x]).replace("\0",s);

		return new BigInteger(z.toString()).mod(M);
		}

	public static void main(String args[]) {
		for (long n : new long[] { 1L, 2L, 5L, 10L, 20L, 58184241583791680L}) {
			System.out.println("" + n + ": " + compute(n));
		}
	}
}
