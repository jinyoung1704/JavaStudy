import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
	static int M; //가로
	static int N; //세로
	static int K;
	static int[][] map,visit;
	
	static int[] nx = {0,0,1,-1};
	static int[] ny = {1,-1,0,0};
	static int count;
	
	 public static void main(String[] args) throws NumberFormatException, IOException
	   {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int n = Integer.parseInt(br.readLine());
	      
	      while(n-->0)
	      {
	    	  String[] temp = br.readLine().split(" ");
	    	  M = Integer.parseInt(temp[0]);
	    	  N = Integer.parseInt(temp[1]);
	    	  K = Integer.parseInt(temp[2]);
	    	  
	    	  map = new int[N][M];
	    	  visit = new int[N][M];
	    	  count = 0;
	    	  
	    	  for(int i=1;i<=K;i++)
	    	  {
	    		  temp = br.readLine().split(" ");
	    		  map[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
	    		  
	    	  }
	    	  
	    	  for(int i=0;i<N;i++)
	    	  {
	    		  for(int j=0;j<M;j++)
	    		  {
	    			//System.out.print(map[i][j]);
	    			  if(map[i][j]==1 && visit[i][j]==0)
	    			 {
	    				  dfs(i,j);
	    				  count++;
	    			 }
	    			
	    		  }//System.out.println();
	    	  }
	    	  
	    	  System.out.println(count);
	      }
	   }
	 
	 public static void dfs(int x,int y)
	 {
		 visit[x][y] = 1;
		 
		 for(int i=0;i<4;i++)
		 {
			 int dx = x + nx[i];
			 int dy = y + ny[i];
			 
			 if(dx>=0 && dy>=0 && dx<map.length && dy<map[0].length)
			 {
				 if(visit[dx][dy]==0 && map[dx][dy]==1)
					 dfs(dx,dy);
			 }
		 }
	 }
}

 






