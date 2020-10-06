package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b016
{
	static int N,M,V;
	
	static int[][] map;
	static int[] visit;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		V = Integer.parseInt(str[2]);
		
		map = new int[N+1][N+1];
		visit = new int[N+1];
		
		for(int i=0;i<M;i++)
		{
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			map[a][b] = map[b][a] = 1;
			
		}
		
		dfs(V);
		visit = new int[N+1];
		System.out.println();
		bfs(V);
	}
	
	public static void dfs(int v)
	{
		System.out.print(v + " ");
		visit[v] = 1;
		
		for(int i=1;i<=N;i++)
		{
			if(map[v][i]==1 && visit[i]==0)
			{
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v)
	{
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(v);
		visit[v] = 1;
		
		while (!qu.isEmpty())
		{
			int temp = qu.poll();
			
			System.out.print(temp + " ");
			
			for(int i=1;i<=N;i++)
			{
				if(map[temp][i]==1 && visit[i]==0)
				{
					visit[i] = 1;
					qu.add(i);
				}
			}
			
		}
	}
}













