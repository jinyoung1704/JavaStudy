package baekjoon;
//백준 15649번 N과 M(1) - nPr 순열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b029
{
   static int [] arr;
   static int [] map;
   static int [] visit;
   static int N,M;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String [] str = br.readLine().split(" ");
	      N = Integer.parseInt(str[0]); //3
	      M = Integer.parseInt(str[1]); //2로 들어오면
	      
	      arr = new int[N];
	      
	      for(int i=0;i<N;i++)
	    	  arr[i] = i+1; //1,2,3 저장
	      
	      map = new int[N];
	      visit = new int[N];
	      
	      dfs(0);
	      
	      
	}
	
	public static void dfs(int v)
	{
		if(v==M) // 처음에 0이 2가 아니므로 패스
		{
			for(int i=0;i<M;i++) 
			{
				System.out.print(map[i] + " "); //1 2 출력
				
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++)
		{
			if(visit[i]==0) //방문한 적이 없으면
			{
				visit[i] = 1;  //방문상태 1로 만들고
				map[v] = arr[i]; //map[0] =1이 되고
				dfs(v+1); //깊이가 1이 되어 다시 호출 위와 같이 반복하면 2가되어
				visit[i] =0; //한줄 완성 후 방문상태 초기화
			}
		}
	}
}


/*
 	static int [] arr;
   static int [] output;
   static int [] visit;
   static int n,r;
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String [] str = br.readLine().split(" ");
      n = Integer.parseInt(str[0]);
      r = Integer.parseInt(str[1]);
      arr = new int[n];
      
      for(int i=0; i<n; i++)
      {
         arr[i] = i + 1;
      }
      
      output = new int[n];
      visit = new int[n];
      
      perm(0);
   }
   
   static void perm(int depth)
   {
      if(depth == r)
      {
         for(int i=0; i<r; i++)
         {
            System.out.print(output[i]+" ");
         }
         System.out.println();
         return;
      }
      
      
      for(int i=0; i<n; i++)
      {
         if(visit[i] == 0)
         {
            visit[i] = 1;
            output[depth] = arr[i];
            perm(depth + 1);
            visit[i] = 0;
         }
      }

 */
