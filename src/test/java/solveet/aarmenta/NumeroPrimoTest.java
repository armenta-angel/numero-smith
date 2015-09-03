package solveet.aarmenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeroPrimoTest {

	@Test
	public void ceroNoEsPrimo() {
		assertEquals(false, NumeroPrimo.esPrimo(0));
	}

	@Test
	public void unoNoEsPrimo() {
		assertEquals(false, NumeroPrimo.esPrimo(1));
	}

	@Test
	public void esPrimo() {
		assertEquals(true, NumeroPrimo.esPrimo(2));
		assertEquals(true, NumeroPrimo.esPrimo(3));
		assertEquals(true, NumeroPrimo.esPrimo(5));
		assertEquals(true, NumeroPrimo.esPrimo(7));
		assertEquals(true, NumeroPrimo.esPrimo(11));
		assertEquals(true, NumeroPrimo.esPrimo(13));
		assertEquals(true, NumeroPrimo.esPrimo(17));
		assertEquals(true, NumeroPrimo.esPrimo(71));
		assertEquals(true, NumeroPrimo.esPrimo(83));
		assertEquals(true, NumeroPrimo.esPrimo(97));		
	}
	
	@Test
	public void noEsPrimo() {
		assertEquals(false, NumeroPrimo.esPrimo(4));
		assertEquals(false, NumeroPrimo.esPrimo(6));		
		assertEquals(false, NumeroPrimo.esPrimo(10));
		assertEquals(false, NumeroPrimo.esPrimo(24));
		assertEquals(false, NumeroPrimo.esPrimo(58));
		
		assertEquals(false, NumeroPrimo.esPrimo(6));
		assertEquals(false, NumeroPrimo.esPrimo(9));		
		assertEquals(false, NumeroPrimo.esPrimo(21));
		assertEquals(false, NumeroPrimo.esPrimo(63));
		assertEquals(false, NumeroPrimo.esPrimo(189));
		
		assertEquals(false, NumeroPrimo.esPrimo(25));		
		assertEquals(false, NumeroPrimo.esPrimo(55));
		assertEquals(false, NumeroPrimo.esPrimo(85));
		assertEquals(false, NumeroPrimo.esPrimo(115));		
	}
	
	@Test
	public void siguientePrimo() {
		assertEquals(2, NumeroPrimo.siguientePrimo(1));
		assertEquals(3, NumeroPrimo.siguientePrimo(2));
		assertEquals(5, NumeroPrimo.siguientePrimo(3));		
		assertEquals(7, NumeroPrimo.siguientePrimo(5));
		assertEquals(7, NumeroPrimo.siguientePrimo(5));
		assertEquals(11, NumeroPrimo.siguientePrimo(7));
		assertEquals(13, NumeroPrimo.siguientePrimo(11));
	}
}
