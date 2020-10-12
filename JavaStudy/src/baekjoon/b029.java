package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b029
{
	static int N,M;
	static int map[],visit[];
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		map = new int[9];
		visit = new int[9];
		
		dfs(0);
		
	}
	
	public static void dfs(int cnt)
	{
		if(cnt==M)
		{
			for(int i=0;i<M;i++)
			{
				System.out.println(map[i] + " ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=N;i++)
		{
			if(map[i]==1)
				continue;
			
			map[i]=1;
			visit[cnt] = i;
			
			dfs(cnt+1);
			visit[i] = 0;
		}
	}
}
