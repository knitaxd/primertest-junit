package entornosTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void sumaPositivos() {
		System.out.println("Sumando dos numeros positivos...");
		Suma S = new Suma(2,3);
		
		assertTrue(S.sumar() == 5);
		
	}
	
	@Test
	public void sumaNegativos() {
		System.out.println("Sumando dos numeros negativos...");
		Suma S = new Suma(-2,-3);
		
		assertTrue(S.sumar() == -5);
		
	}
	
	@Test
	public void sumaPositivoNegativo() {
		System.out.println("Sumando un negtivo y un positivo...");
		Suma S = new Suma(-2,3);
		
		assertTrue(S.sumar() == 1);
		
	}
	

}
