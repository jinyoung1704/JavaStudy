package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b019
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		//①
		for(int i=0;i<9;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>max)
			{
				max = arr[i];
				index = i;
			}
		}
		
		/* ② --==> 결과는 나오는데 틀렸다 나옴
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
			
		}
		
		int index = Arrays.binarySearch(arr, max);
		*/
		
		System.out.println(max);
		System.out.println(index+1);
	}
}
