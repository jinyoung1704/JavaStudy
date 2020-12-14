package baekjoon;
//백준 10872번 팩토리얼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10872
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int total = factorial(n);
		System.out.println(total);
	}
	
	public static int factorial(int n)
	{
		if(n<=1)
			return 1;
		else
			return n * factorial(n-1);
	}
}
