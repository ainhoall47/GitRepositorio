package Factorial;

/**
 * <h2> Documentamos: Clase Program. <h2>
 * 
 * @author Ainhoa Lodeiro López
 * @Version 1
 * @since 07/04/2023
 * 
 */
public class ProgramaPrincipal 
{
	/**
	 * Programa principal, el cual pide al usuario el número el
	 * cual se quiere factorizar (mayor o igual que 0 y menor o igual que 25)
	 * @param args
	 * @throws se lanzará una excepción en caso de que el usuario 
	 * introduzca un valor que no sea un número entero
	 */
	public static void main(String[] args) 
	{
		try
        {
            int numero, factorial;
            CalculoFactorial objFactorial = new CalculoFactorial();
        
            System.out.print("Introducir un número: ");
            numero = Teclado.entero();
        
            if ((numero >= 0) && (numero < 25))
            {
                factorial = objFactorial.Factorial(numero);
                System.out.println("El factorial es: " + factorial);
            }
            else System.out.println("Introducir valor 0 o entre 0 y 25.");
        }
        
        catch (Exception MessageError)
        {
            System.out.println("Error");
        }
	}
}
