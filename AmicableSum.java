package refactoring_lab;

public class AmicableSum
{
	/**
     * Calculates the sum of all the amicable numbers (from 1 to rangeMaxNumber).
     * 220 + 284 + ... + 6368 = 31626
     * @param rangeMaxNumber - boundary value of numbers(in this case: 10000)
     * @return sum of amicable numbers (from 1 to boundary value)
     */

	public static void main(String[] args)
	{
		System.out.println(calculateAmicableSum(10000));
	}
	
	public static int calculateAmicableSum(int rangeMaxNumber)
	{
		int amicablesSum = 0;
		for(int i = 1; i <= rangeMaxNumber - 1; i++ )
		{
			if(isAmicable(i))
			{
				amicablesSum += i;
			}
		}
		return amicablesSum;
	}
	
	public static boolean isAmicable(int number)
	{
		int numberDivisionSum = getDivisionSum(number);
		if(numberDivisionSum == number)
		{
			return false;
		}
		
		int secondNumberDivisionSum = getDivisionSum(numberDivisionSum);
		
		if(secondNumberDivisionSum == number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int getDivisionSum(int number)
	{
		int divisionsSum = 0;
		for(int i = 1; i <= number - 1; i++ )
		{
			if(number % i == 0)
			{
				divisionsSum += i;
			}
		}
		return divisionsSum;						
	}

}
