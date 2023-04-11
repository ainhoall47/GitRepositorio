package Factorial;

public class CalculoFactorial
{
	public int Factorial(int num) 
	{
		int factorial, resto;
        factorial = num;
        resto = num;
        
        if (num != 0)
        {
            while (resto >= 2)
            {
            	resto = resto -1;
                factorial = factorial * resto;
            }
        }
        else
        {
        	factorial = 1;
        }
        return factorial;
	}
}
