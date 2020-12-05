package baekjoon;

import java.util.Scanner;

public class b1152
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		int count = 0;
		
		for(String s :str)
		{
			count++;
			if(s.equals(""))
				count--;
		}
		
		
		System.out.println(count);
		
	}
}
