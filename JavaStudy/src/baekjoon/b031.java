package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2609번 최대공약수 최소공배수

public class b031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(minValue(a, b));
		System.out.println(maxValue(a, b));
		
	}
	
	public static int minValue(int a, int b)
	{
		while(b>0)
		{
			int temp = b;
			b = a%b;
			a = temp;
		}
		
		return a;
	}
	
	public static int maxValue(int a, int b)
	{
		return a*b/minValue(a, b);
	}
}
