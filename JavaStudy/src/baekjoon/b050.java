package baekjoon;
//백준 2920번 음계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		String[] str = br.readLine().split(" ");
		
		for(int i=0;i<8;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] == arr[i]+1)
				flag = 1;
			else if(arr[i+1] == arr[i]-1)
				flag = -1;
			else
			{
				flag = 0;
				break;
			}
			//System.out.println(flag);
		}
		
		if(flag==1)
			System.out.println("ascending");
		else if(flag==-1)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
