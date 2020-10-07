package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b018
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		int[] B = new int[n];
	
		String[] str;
		
		for(int i=0;i<n;i++)
		{
			str = br.readLine().split(" ");
			A[i] = Integer.parseInt(str[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			str = br.readLine().split(" ");
			B[i] = Integer.parseInt(str[i]);
		}
	}
}	
