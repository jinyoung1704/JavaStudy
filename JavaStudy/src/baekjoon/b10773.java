package baekjoon;
//백준 10773번 제로

import java.util.Scanner;
import java.util.Stack;

public class b10773
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		
		while(n-->0)
		{
			int su = sc.nextInt();
			
			if(su==0 && !stack.isEmpty())
				stack.pop();
			else
				stack.add(su);
				
		}
		sc.close();
		
		int sum = 0;
		while(!stack.isEmpty())
			sum += stack.pop();
		
		System.out.println(sum);
	}
}
