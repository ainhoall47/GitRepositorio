package Factorial;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class TecladoTest 
{
	//Variables
	String cadena;
	int resultEntero;
	float resultReal;
	double resultDoble;
	@Test
	void testEntero() 
	{
		//Prueba un valor entero positivo
		cadena = "5";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultEntero = Teclado.entero();
		assertEquals(5, resultEntero);
		
		//Prueba un valor entero negativo
		cadena = "-5";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultEntero = Teclado.entero();
		assertEquals(-5, resultEntero);
	}
	
	void testExceptionEntero() 
	{
		//Prueba valor no numérico
		try 
		{
			cadena = "a";
			System.setIn(new ByteArrayInputStream(cadena.getBytes()));
			resultEntero = Teclado.entero();
			fail("Error valor no númerico");
		}
		catch(ArithmeticException e) 
		{
			//Prueba satisfactoria
		}
	}
	
	@Test
	void testReal() 
	{
				
		//Prueba un valor postivo decimal
		cadena = "5.4";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultReal = Teclado.real();
		assertEquals(5.4F, resultReal);
		
		//Prueba valor negativo decimal
		cadena = "-5.4";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultReal = Teclado.real();
		assertEquals(-5.4F, resultReal);
	}
	
	void testExceptionReal() 
	{
		//Prueba valor no numérico
		try 
		{
			cadena = "a";
			System.setIn(new ByteArrayInputStream(cadena.getBytes()));
			resultReal = Teclado.real();
			fail("Error valor no númerico");
		}
		catch(ArithmeticException e) 
		{
			//Prueba satisfactoria
		}
	}
	
	@Test
	void testRealDoble()
	{
		
		//Prueba un valor positivo decimal doble
		cadena = "5340.4836";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultDoble = Teclado.realDoble();
		assertEquals(5340.4836, resultDoble);
		
		//Prueba un valor negativo decimal doble
		cadena = "-5340.4836";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		resultDoble = Teclado.realDoble();
		assertEquals(-5340.4836, resultDoble);
	}
	
	void testExceptionRealDoble() 
	{
		//Prueba valor no numérico
		try 
		{
			cadena = "a";
			System.setIn(new ByteArrayInputStream(cadena.getBytes()));
			resultDoble = Teclado.realDoble();
			fail("Error valor no númerico");
		}
		catch(ArithmeticException e) 
		{
			//Prueba satisfactoria
		}
	}
	
	@Test
	void testCadena() 
	{
		//Variables
		String cadena;
		String cadenaResultante;
		
		//Prueba una cadena
		cadena = "Hola";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		cadenaResultante = Teclado.cadena();
		assertEquals("Hola", cadenaResultante);
	}
	
	@Test
	void testCaracter() 
	{
		//Variables
		String cadena;
		char caracterResultante;
		
		//Prueba caracter;
		cadena = "a";
		System.setIn(new ByteArrayInputStream(cadena.getBytes()));
		caracterResultante = Teclado.caracter();
		assertEquals('a', caracterResultante);
	}
}
