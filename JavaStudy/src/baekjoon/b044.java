package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 10828번 스택

public class b044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=1;i<=n;i++)
		{
			String[] str = br.readLine().split(" ");
			
			switch (str[0])
			{
			case "push":
				stack.add(Integer.parseInt(str[1]));
				break;

			case "pop" :
				if(!stack.isEmpty())
					System.out.println(stack.pop());
				else
					System.out.println(-1);
				break;
				
			case "size" :
				System.out.println(stack.size());
				break;
				
			case "empty" : 
				if(!stack.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
				break;
				
			case "top" : 
				if(!stack.isEmpty())
					System.out.println(stack.peek());
				else
					System.out.println(-1);
				break;
				
			default:
				break;
			}
		}
	}
}
