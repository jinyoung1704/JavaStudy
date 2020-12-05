package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class b4153
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";

		ArrayList<String> list = new ArrayList<String>();
		do
		{
			temp =  br.readLine();
			String[] str =temp.split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(Math.pow(a, 2) + Math.pow(b,2) == Math.pow(c,2))
				list.add("right");
			else if(Math.pow(a, 2) + Math.pow(c,2) == Math.pow(b,2))
				list.add("right");
			else if(Math.pow(b, 2) + Math.pow(c,2) == Math.pow(a,2))
				list.add("right");
			else
				list.add("wrong");
				
			
		} while (!temp.equals("0 0 0"));
	
		list.remove(list.size()-1);
		for(String result : list)
			System.out.println(result);
	}
}
