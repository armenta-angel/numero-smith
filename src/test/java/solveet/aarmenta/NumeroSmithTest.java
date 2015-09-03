package solveet.aarmenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroSmithTest {
	
	@Test
	public void esNumeroSmith() {
		assertEquals(true, NumeroSmith.esNumeroSmith(22));
		assertEquals(true, NumeroSmith.esNumeroSmith(378));
		assertEquals(true, NumeroSmith.esNumeroSmith(166));
		assertEquals(true, NumeroSmith.esNumeroSmith(355));
	}
	
	@Test
	public void noEsNumeroSmith() {
		assertEquals(false, NumeroSmith.esNumeroSmith(16));
		assertEquals(false, NumeroSmith.esNumeroSmith(320));
	}
}
