package baekjoon;
//백준 2675번 문자열반복

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b048
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0)
		{
			String[] s = br.readLine().split(" ");
			int k = Integer.parseInt(s[0]);
			char[] temp = s[1].toCharArray();
			String p = "";
			
			for(int i=0;i<temp.length;i++)
			{
				for(int j=1;j<=k;j++)
				{
					p += temp[i];
				}
			}
			
			System.out.println(p);
		}
	}

}
