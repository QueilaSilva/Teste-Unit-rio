package test.calculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testMain() {
		int soma = Calculadora.main("8500+8000/2");
		assertEquals(8250, soma);
	System.out.println("O valor sera 8250");
	}

}
