package Factorial;
/**
 * <h2> Documentamos: Clase CalculoFactorial. <h2>
 * 
 * @author Ainhoa Lodeiro López
 * @Version 1
 * @since 11/04/2023
 * 
 */
public class CalculoFactorial
{
	/**
	 * A través del número dado por el usuario calculamos el factorial.
	 * @param numero
	 * @return resultado del calculo factorial
	 */
	public int Factorial(int num)
	{
		int factorial, resto;
        factorial = resto =  num;
        
        if (num != 0)
        {
            while (resto >= 2)
            {
            	resto--;
                factorial *= resto;
            }
        }
        else factorial = 1;
        return factorial;
	}
}
