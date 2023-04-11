package Factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramaPrincipalTest {

	@Test
	void test() 
	{
		CalculoFactorial objFactorial = new CalculoFactorial();
		
		//Variables a usar
		
		int numero;
		int resultadoEsperado, resultadoObtenido;
		
		//Caso de prueba 1
		//número dentro del intervalo
		
		numero = 5;
		resultadoEsperado = 120;
		resultadoObtenido = objFactorial.Factorial(numero);
		assertEquals(resultadoEsperado, resultadoObtenido, 0);
		
		//Caso de prueba 2
		//número menor a 0
		
		try {
			numero = -1;
		}
		catch (Exception e){
			assertEquals("java.lang.NumberFormatException", e.getClass().getName());
		}
		
		//Caso de prueba 3
		//número mayor a 25
		
		try {
			numero = 27;
		}
		catch (Exception e){
			assertEquals("java.lang.NumberFormatException", e.getClass().getName());
		}
		
		//Caso de prueba 4
		//Introducir valores no numéricos
		
		try {
		}
		catch (Exception e){
			assertEquals("java.lang.NumberFormatException", e.getClass().getName());
		}
	}
}
