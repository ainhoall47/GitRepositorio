package Factorial;


public class ProgramaPrincipal 
{
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
