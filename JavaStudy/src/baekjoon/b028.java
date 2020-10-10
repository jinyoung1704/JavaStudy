package baekjoon;

import java.util.Scanner;

public class b028
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int count = 0;
		
		for(int i=0;i<n;i++)
		{
			int su = sc.nextInt();
			
			boolean flag = true;
			
			if(su==1)
			{
				flag = false;
			}
			else
			{
				for(int j=2;j<=su/2;j++)
				{
					if(su%j==0)
						flag = false;
					
				}
			}
			
			if(flag)
				count++;
		}
		
		System.out.println(count);
	}
	

}
