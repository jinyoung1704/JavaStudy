package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b006
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		char[] cha = temp.toCharArray();
		
		Arrays.sort(cha);
		
		for(int i=cha.length-1;i>=0;i--)
			System.out.print(cha[i]);
	}
}
