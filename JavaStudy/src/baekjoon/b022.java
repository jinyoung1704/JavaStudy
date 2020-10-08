package baekjoon;
//백준 3052번 나머지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b022
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			int mod =(Integer.parseInt(br.readLine()))%42;
			
			if(!list.contains(mod))
			{
				list.add(mod);
			}
		}
			
		System.out.println(list.size());
		
		
		
	}
}
