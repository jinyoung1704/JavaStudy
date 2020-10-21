package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2798번 블랙잭 dfs 방법

public class b040
{
	static int n;
	static int su;
	static int[] arr,output,visit;
	static int max;
	static int sum;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		su = Integer.parseInt(str[1]);
		
	
		arr = new int[n];
		output = new int[3];
		visit = new int[n];
		
		String[] temp = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(temp[i]);
		}

		dfs(0);
		System.out.println(max);
	}
	
	public static void dfs(int v)
	{
		
		
		if(v==3)
		{
			sum = 0;
			
			for(int i=0;i<output.length;i++)
			{
				sum += output[i];
			}
			
			//※ 여기서 return 하면 위에 출력으로 가는게 아니라  ①로 가서 머물렀던게 문제
			
			if(max<sum && sum<=su)
				max = sum;
		
			//만약 반환형을 int로 했을 경우는 return 0으로 해서 끊어줘야함
			return;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(visit[i]==0)
			{
				visit[i] = 1;
				output[v] = arr[i];
				dfs(v+1); // 그러면 0을 여기서 머물고 --①
				visit[i] = 0;
			}
		}
		
		//return max; 로 여기서 max값 반환.
	}

	
	
}
