import java.util.Scanner;

public class Main
{
	
	static int N,M;
	static int[] output,visit;
	static int[] arr;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		arr = new int[N];
		
		for(int i=0;i<N;i++)
			arr[i] = i+1;
		
		output = new int[N];
		visit = new int[N];
		
		dfs(0);
		
	}
	
	public static void dfs(int v)
	{
		if(v==M)
		{
			for(int i=0;i<M;i++)
			{
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++)
		{
			if(visit[i]==0)
			{
				visit[i] = 1;
				output[v] = arr[i];
				dfs(v+1);
				visit[i] = 0;
			}
		}
	}
	
}

 






