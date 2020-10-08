package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b021
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 1;
		
		for(int i=0;i<3;i++)
		{
			sum *= Integer.parseInt(br.readLine());
		}
		
		//System.out.println(sum);
		
		String[] str = Integer.toString(sum).split("");
		
		
		for(int i=0;i<=9;i++)
		{
			int count = 0;
			
			//System.out.println(su);
			
			for(int j=0;j<str.length;j++)
			{
				int su = Integer.parseInt(str[j]);
				
				if(su==i)
					count++;
			}
			System.out.println(count);
		}
		
		//System.out.println(str);
		
		
	}
}
