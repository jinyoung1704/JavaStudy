package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b018
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		String[] str1 = br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
			A[i] = Integer.parseInt(str1[i]);
		}

		for(int i=0;i<n;i++)
		{
			
			B[i] = Integer.parseInt(str2[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			sum += A[i] * B[n-1-i];
		}
		
		System.out.println(sum);
	}
}	
