package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b041
{
	static int[][] matrix,map,visit;
	static int M;//가로길이
	static int N;//세로길이
	static int K;//배추가 심어져 있는 위치의 개수
	static int X,Y; //배추가 심어져 있는 위치
	static int count;
	
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=T;i++)
		{
			String[] str = br.readLine().split(" ");
			M = Integer.parseInt(str[0]);
			N = Integer.parseInt(str[1]);
			K = Integer.parseInt(str[2]);
			
			matrix = new int[N][M];
			map = new int[N][M];
			visit = new int[N][M];
			
			count = 0;
			
			for(int j=1;j<=K;j++)
			{
				str = br.readLine().split(" ");
				X = Integer.parseInt(str[0]);
				Y = Integer.parseInt(str[1]);
				
				matrix[Y][X]=1;
			}
			
			for(int r=0;r<N;r++)
			{
				for(int h=0;h<M;h++)
				{
					
					//System.out.print(matrix[r][h]);
					if(matrix[r][h]==1 && visit[r][h]==0)
					{
						dfs(r,h);
						count++;
						
					}
					
				}
				//System.out.println();
				
			}
			
			list.add(count);
			
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	public static void dfs(int x,int y)
	{
		visit[x][y] =1;
		
		for(int i=0;i<4;i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<matrix.length && ny<matrix[0].length)
			{
				if(visit[nx][ny]==0 && matrix[nx][ny]==1)
				{
					dfs(nx,ny);
				}
			}
		}
	}
}
