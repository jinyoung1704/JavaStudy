package baekjoon;

import java.util.Scanner;

public class b1152
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		count++;
		
		if(str.charAt(0)==' ')
			count--;
		else if((str.charAt(str.length()-1))==' ')
				count--;
		
		System.out.println(count);
		
		
	}
}
