package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b012
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] su = br.readLine().split(" ");
		
		int a = Integer.parseInt(su[0]);
		int b = Integer.parseInt(su[1]);
		
		if(a>b)
			System.out.println(">");
		else if(a<b)
			System.out.println("<");
		else
			System.out.println("==");
		
	}
}
