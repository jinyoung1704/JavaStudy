package baekjoon;

import java.util.Scanner;

public class b1929
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] check = new boolean[N+1];
		
		check[0] = check[1] = true;
	
		for(int i=2;i<=N;i++)
		{
			if(check[i])
				continue;

			for(int j=i*i;j<check.length;j+=i)
			{
				check[j] = true;
			}
		}
		
		
		for(int i=M;i<=N;i++)
		{
			if(!check[i])
				System.out.println(i);
		}
	}
}
