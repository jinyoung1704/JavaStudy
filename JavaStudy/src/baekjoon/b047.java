package baekjoon;
//백준 9012번 괄호

import java.util.Scanner;
import java.util.Stack;

public class b047
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			String word = sc.next();
			Stack<Character> stack = new Stack<Character>();
			boolean isVPS = true;
			
			for(int j=0;j<word.length();j++)
			{
				char cha = word.charAt(j);
				
				if(cha=='(')
				{
					stack.add('(');
				}
				else if(cha==')')
				{
					if(!stack.isEmpty())
						stack.pop();
					else
					{
						isVPS = false;
						break;
					}
				}
				
				
			}
			
			if(!stack.isEmpty())
				isVPS = false;
			
			if(isVPS)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
}

























