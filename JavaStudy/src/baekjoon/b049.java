package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 1662번 압축

public class b049
{
	static int[] s = new int[50];
	static char[] cha;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		cha = br.readLine().toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<cha.length;i++)
		{
			//System.out.println(cha[i]);
			if(cha[i]=='(')
				stack.push(i);
			if(cha[i]==')')
				s[stack.pop()] = i;
			
		}
		System.out.println(result(0, cha.length));
	}
	
	public static int result(int start, int end)
	{
		int sLength=0;
		
		for(int i=start;i<end;i++)
		{
			if(cha[i]=='(')
			{
				sLength += (cha[i-1]-'0') * result(i+1,s[i]) -1;
				i = s[i];
			}
			else
				sLength++;
		}
		
		return sLength;
	}
}

