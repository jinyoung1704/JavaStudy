package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 3986번 좋은 단어

public class b3986
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		
		for(int i=1;i<=n;i++)
		{
			String temp = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			
			for(int j=0;j<temp.length();j++)
			{
				if(stack.isEmpty())
					stack.push(temp.charAt(j));
				else
				{
					if(temp.charAt(j)==stack.peek())
						stack.pop();
					else
						stack.push(temp.charAt(j));
				}
				
				
			}
			
			if(stack.isEmpty())
				count++;
		}
		
		System.out.println(count);
		
	}
}
