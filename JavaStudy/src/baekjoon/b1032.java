package baekjoon;
//백준 1032번 명령 프롬프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1032
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		
		for(int i=0;i<str.length;i++)
			str[i] = br.readLine();
		
		boolean check;
		for(int i=0;i<str[0].length();i++)
		{
			check = false;
			
			for(int j=0;j<n-1;j++)
			{
				if(str[j].charAt(i) != str[j+1].charAt(i))
				{
					check = true;
					break;
				}
			}
			
			if(check)
				System.out.print("?");
			else
				System.out.print(str[0].charAt(i));
			
			
		}
	}
}
