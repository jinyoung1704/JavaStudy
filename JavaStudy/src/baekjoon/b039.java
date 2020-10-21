package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2798번 블랙잭

public class b039
{

	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int su = Integer.parseInt(str[1]);
		
	
		int[] arr = new int[n];
		String[] temp = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(temp[i]);
		}
		//1 2 3 4 5
		//System.out.println(arr[1]);

		int result = search(arr, n, su);
		System.out.println(result);
	}
	
	static int search(int[] arr, int n, int su)
	{
		int max = 0;
		
		for(int i=0;i<n-2;i++)
		{
			
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int sum = arr[i] + arr[j] + arr[k];
					
					if(su==sum)
						return sum;
					
					if(max<sum && sum<su)
						max = sum;
					
				}

			}
			
		}
		
		return max;
	}
	
	
}
