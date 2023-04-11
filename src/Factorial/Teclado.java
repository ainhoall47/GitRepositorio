package Factorial;

import java.io.*;
/**
 * <h1> Documentamos: Clase Teclado. </h1>
 * <h2> Clase Teclado. Simplifica las entradas de datos por teclado </h2>
 * Teclado.entero para leer un n�mero entero (int) por teclado
 * Teclado.real para leer un numero real simple (float) por teclado
 * Teclado.realDoble para leer un numero real doble (double) por teclado
 * Teclado.cadena para leer una cadena de caracteres (string) por teclado
 * Teclado.caracter para leer un car�cter (char) por teclado
 * 
 * @author Joaquín Alvarez García
 * @version 1
 * @since 16/03/2023
 *
 */
public class Teclado
{
	static String inicializar()
	{
		String buzon ="";
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader miTeclado = new BufferedReader(flujo);
		 	
		try
		{
			buzon=miTeclado.readLine();
		}
		catch (Exception e)
		{

		}
		return buzon;
	}

	static int entero()
	{
		int valor=Integer.parseInt(inicializar());
		return valor;
	}
	
	static float real()
	{
		float valor=Float.parseFloat(inicializar());
		return valor;
	}

	static double realDoble()
	{
		double valor=Double.parseDouble(inicializar());
		return valor;
	}
	
	static String cadena()
	{
		String valor= inicializar();
		return valor;
	}
	
	static char caracter()
	{
		String valor= inicializar();
		return valor.charAt(0);
	}
}