package baekjoon;
//백준 2775번 부녀회장이 될거야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		int[][] apt = new int[15][15];
		
		for(int i=0;i<15;i++)
		{
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		
		for(int i=1;i<15;i++)
		{
			for(int j=2;j<15;j++)
			{
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		StringBuffer sb = new StringBuffer();
		while(count-->0)
		{
			int k = Integer.parseInt(br.readLine()); //층
			int n = Integer.parseInt(br.readLine()); //호
			
			sb.append(apt[k][n] + "\n");
			
		}
		
		System.out.println(sb);
		
	}
}
