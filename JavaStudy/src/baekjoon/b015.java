package baekjoon;

import java.util.Scanner;
//백준 별찍기 -10 

public class b015
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=n;i++)
					System.out.print("*");		
			}
			else
			{
				for(int j=1;j<=n;i++)
				{
					if(j%2==0)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			
			System.out.println();
				
		}
	}
}
