package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b017
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		String[] str = br.readLine().split(" ");
		
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(str[i]);
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
