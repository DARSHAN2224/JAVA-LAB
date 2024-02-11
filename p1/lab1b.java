package p1;
import java.util.Scanner;
public class lab1b 
{
	static int even_sum = 0, odd_product = 1;
	static double Avg = 0, sum = 0;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n for nth fibonacci series:");
		int n = s.nextInt();
		int lp = isLargestPrimeFibSeries(n);
		System.out.println("Even sum of fibonacci series is :" + even_sum);
		System.out.println("Odd productof fibonacci series is :" + odd_product);
		if (lp != 0)
			System.out.println("Largest prime in fibonacci series is " + lp);
		else
			System.out.println("prime number is not found");
		System.out.println("Avg of fibonacci series is :" + Avg);
		s.close();
	}
	private static int isLargestPrimeFibSeries(int n) 
	{
		int f0 = 0, f1 = 1, f2 = 0, np = 0, count = 0;
		while (count < n) 
		{
			count++;
			sum += f2;
			if (f2 % 2 == 0)
				even_sum += f2;
			else
				odd_product *= f2;
			if (isprime(f2))
				np = f2;
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		Avg = sum / count;
		return np;
	}
	public static boolean isprime(int f2) 
	{
		int count = 0;
		for (int i = 2; i <= f2 / 2; i++)
			if (f2 % i == 0) 
			{
				count++;
				break;
			}
		if (count == 0)
			return true;
		else
			return false;
	}
}