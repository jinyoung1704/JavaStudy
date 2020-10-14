package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 15650번 N과 M(2)

public class b030
{	
	static int N,M;
	static int[] output,visit,arr;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		arr = new int[N];
		visit = new int[N];
		output = new int[N];
		
		for(int i=0;i<N;i++)
			arr[i] = i+1;
		
		dfs(0);
	}
	
	public static void dfs(int depth)
	{
		if(depth==M)
		{
			for(int i=0;i<M;i++)
				System.out.print(output[i] + " ");
			
			System.out.println();
			return;
		}
		
		for(int i=depth;i<N;i++)
		{
			
			if(visit[i]==0)
			{
				
				visit[i] = 1;
				output[depth] = arr[i];
				dfs(depth+1);
				visit[i] = 0;
			}
			
			
		}
	}

}
