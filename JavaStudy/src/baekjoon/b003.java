package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class b003
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int result : list)
			sb.append(result + "\n");
		
		System.out.println(sb.toString());
	}
}
