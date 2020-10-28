package baekjoon;

import java.util.Scanner;

//백준 11050 이항계수
/*
 
이항계수 = n!
		 ------
		 k!(n-k)!

 */
public class b11050
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
	}
	
	public static int factorial(int su)
	{
		int total=1;
		for(int i=su;i>=1;i--)
			total *= i;
		
		return total;
	}
}
