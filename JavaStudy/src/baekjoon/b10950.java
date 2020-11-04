package baekjoon;
//백준 b10950번 A+B-3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10950
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=n;i++)
		{
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			sb.append(a+b +"\n");
		}
		
		
		System.out.print(sb.toString());
	}
}
