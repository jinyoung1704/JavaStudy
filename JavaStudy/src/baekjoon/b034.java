package baekjoon;
//백준 9093번 단어뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b034
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<n;i++)
		{
			Stack<Character> stack = new Stack<>();
			
			String s = br.readLine();
			
			
			
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==' ')
				{
					while(!stack.empty())
					{
						sb.append(stack.pop());
						//System.out.print(stack.pop());
					}
					sb.append(" ");
					//System.out.print(" ");
				}
				else
				{
					stack.push(s.charAt(j));
					//stack.push(s.charAt(j));
				}
				
				
	
			}
			
			while(!stack.empty())
			{
				sb.append(stack.pop());
				//System.out.print(stack.pop());
			}
			
			sb.append("\n");
			
		}
		
		
		System.out.println(sb.toString());
		
		
		
	}

}

