package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 15650번 N과 M(2) - 조합
//조합은 (1,2)와 (2,1)을 똑같이 본다.

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
		
		visit = new int[9];
		output = new int[9];
		
	
		dfs(0,0);
	}
	
	public static void dfs(int depth,int cnt)
	{
		if(cnt==M)
		{
			for(int i=0;i<M;i++)
				System.out.print(output[i] + " ");
			
			System.out.println();
			return;
		}
		
		for(int i=depth+1;i<=N;i++) //초기 시작 때 1부터 N까지
		{
			
			if(visit[i]==1) //방문기록이 있으면 패스
				continue;
				
			visit[i] = 1;
			output[cnt] = i; 
			dfs(i,cnt+1); 
			visit[i] = 0;
			
			
			
		}
	}

}
