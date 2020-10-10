package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//백준 1934번 최소공배수

public class b027
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str;
		int[] result = new int[n];
		
		for(int i=0;i<n;i++)
		{
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			result[i] = max(a,b);
		}
		
		for(int su : result)
			System.out.println(su);
		
	}
	
	public static int min(int x,int y)
	{
		while(y>0)
		{
			int temp = y;
			y = x%y;
			x = temp;
		}
		
		return x;
	}
	
	public static int max(int x,int y)
	{
		return x*y/min(x,y);
	}
}
