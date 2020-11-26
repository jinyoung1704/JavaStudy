package baekjoon;
//백준 1546번 평균

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1546
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double max=0.0;
		String[] str = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		
		
		for(double su : arr)
			max = (double)Math.max(su, max);

		double sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			arr[i] = arr[i]/max*100;
			//System.out.println(arr[i]);
			sum += arr[i];
		}
		
		System.out.println(sum/n);
	}
}
