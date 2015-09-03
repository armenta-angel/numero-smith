package solveet.aarmenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescomposicionCanonicaTest {

	@Test
	public void descomponerCeroEsCero() {
		assertEquals("0", Utils.descomposicionToString(DescomposicionCanonica.descomponer(0)));
	}

	@Test
	public void descomponerUnoEsUno() {
		assertEquals("1", Utils.descomposicionToString(DescomposicionCanonica.descomponer(1)));
	}

	@Test
	public void descomponer() {
		assertEquals("2", Utils.descomposicionToString(DescomposicionCanonica.descomponer(2)));
		assertEquals("3", Utils.descomposicionToString(DescomposicionCanonica.descomponer(3)));
		assertEquals("5", Utils.descomposicionToString(DescomposicionCanonica.descomponer(5)));
		assertEquals("7", Utils.descomposicionToString(DescomposicionCanonica.descomponer(7)));
		assertEquals("11", Utils.descomposicionToString(DescomposicionCanonica.descomponer(11)));
		assertEquals("13", Utils.descomposicionToString(DescomposicionCanonica.descomponer(13)));
		
		assertEquals("2,2", Utils.descomposicionToString(DescomposicionCanonica.descomponer(4)));
		assertEquals("2,3", Utils.descomposicionToString(DescomposicionCanonica.descomponer(6)));
		assertEquals("2,5", Utils.descomposicionToString(DescomposicionCanonica.descomponer(10)));
		assertEquals("3,5", Utils.descomposicionToString(DescomposicionCanonica.descomponer(15)));
		
		assertEquals("2,11", Utils.descomposicionToString(DescomposicionCanonica.descomponer(22)));
		
		assertEquals("2,3,3,3,7", Utils.descomposicionToString(DescomposicionCanonica.descomponer(378)));
	}
}
