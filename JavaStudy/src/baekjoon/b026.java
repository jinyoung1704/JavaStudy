package baekjoon;

import java.util.Scanner;
//백준 2609 최대공약수와 최소공배수

public class b026
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println(min(a,b));
		System.out.println(max(a,b));
	}
	
	public static int min(int x,int y) //최대공약수
	{
		while(y>0) //유클리드 호제법 
		{
			int temp = y;
			y = x%y;
			x = temp;
		}
		
		return x;
	}
	
	public static int max(int x,int y) //최소공배수
	{
		return x*y/min(x,y);
	}
}
