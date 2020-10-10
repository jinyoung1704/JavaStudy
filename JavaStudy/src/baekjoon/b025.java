package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//백준 2606 바이러스

public class b025
{
	static int[][] map;
	static int[] visit;
	static int n ;
	static int count;
	static int computer;
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		computer = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		String[] str;
		
		map = new int[computer+1][computer+1];
		visit = new int[computer+1];
		for(int i=1;i<=n;i++)
		{
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			map[a][b] = map[b][a] = 1;
		}
		
		bfs(1);
	}
	
	public static void bfs(int v)
	{
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(v);
		visit[v]=1;
		
		while(!qu.isEmpty())
		{
			int temp = qu.poll();
			
			for(int i=1;i<=computer;i++)
			{
				if(map[temp][i]==1 && visit[i]!=1)
				{
					//System.out.println(i);
					qu.add(i);
					visit[i]=1;
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}
