package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
//백준 별찍기 -10 

public class b015
{
	static char[][] map = new char[6561][6561];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		map = new char[n][n];
	      
	      for(int i=0;i<map.length;i++) {
	         Arrays.fill(map[i],' ');
	      }
	      
	      solve(n,0,0);
	      
	      for(int i=0;i<map.length;i++) {
	         System.out.println(map[i]);
	      }
	   }

		
		
		
	
	
	static void solve(int n,int x,int y)
	{
		if(n==1)
		{
			map[x][y] = '*';
			return;
		}
			
		int div = n/3;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1 && j==1)
					continue;
				
				solve(div, x + (div*i) , y + (div*j));
			}
		}
		
	}
}

//Arrays.fill(msg, 'a'); --==>> 배열의 값을 모두 a라는 문자로 초기화함


