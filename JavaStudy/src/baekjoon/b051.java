package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 14719번 빗물
public class b051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] str = br.readLine().split(" ");
		
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		
		int[] arr = new int[W];
		int answer = 0;
		
		str = br.readLine().split(" ");
		for(int i=0;i<W;i++)
			arr[i] = Integer.parseInt(str[i]);
		
		for(int i=1;i<W;i++)
		{
			int current;
			int leftMax;
			int rightMax;
			
			current = arr[i];
			leftMax = current;
			rightMax = current;
			
			//왼쪽
			for(int k=i-1;k>=0;k--)
			{
				if(arr[k]>current)
					leftMax = Math.max(arr[k], leftMax);
			}
			
			//오른쪽
			for(int k=i+1;k<W;k++)
			{
				if(arr[k]>current)
					rightMax = Math.max(arr[k], rightMax);
			}
			
			if(Math.min(leftMax, rightMax)>current)
			{
				answer += Math.min(leftMax, rightMax) - arr[i];
			}
		
		
		}
		System.out.println(answer);
	}
}










