package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 10816번 숫자 카드2
public class b10816
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		String[] temp = br.readLine().split(" ");
		
		
		for(int i=0;i<N;i++)
			arr[i] = (Integer.parseInt(temp[i]));
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		temp = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<M;i++)
		{
			int su = Integer.parseInt(temp[i]);
			
			//System.out.println(su);
			int count = 0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(su==arr[j])
					++count;
			}
			
			 sb.append(count +" ");
			//System.out.print(count+" ");
		}
		
		//for(int i=0;i<sb.length();i++)
			System.out.print(sb.toString());
	}
}
