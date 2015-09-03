package solveet.aarmenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescomposicionDigitosTest {

	@Test
	public void descomponer() {
		assertEquals("2,2", Utils.descomposicionToString(DescomposicionDigitos.descomponer(22)));
		assertEquals("4,1,2", Utils.descomposicionToString(DescomposicionDigitos.descomponer(412)));
		assertEquals("0", Utils.descomposicionToString(DescomposicionDigitos.descomponer(0)));
		assertEquals("1,4,2,5,9", Utils.descomposicionToString(DescomposicionDigitos.descomponer(14259)));		
	}
}
