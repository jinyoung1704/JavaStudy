import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
	static char[] cha;
	static int[] s = new int[50];
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		cha = br.readLine().toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<cha.length;i++)
		{
			if(cha[i]=='(')
				stack.push(i);
			
			if(cha[i]==')')
				s[stack.pop()] = i;
				
		}
		
		System.out.println(cal(0,cha.length));
		
	}
	
	public static int cal(int start, int end)
	{
		int sLength=0;
		
		for(int i=start;i<end;i++)
		{
			if(cha[i]=='(')
			{
				sLength += (cha[i-1] - '0') * cal(i+1,s[i])-1;
				i = s[i];
			}
			else
				sLength++;
			
		}
		
		return sLength;
	}
}

 






