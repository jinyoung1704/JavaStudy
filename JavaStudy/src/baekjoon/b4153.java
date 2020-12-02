package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b4153
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int[][] arr = new int[str.length-1][3];
		ArrayList<String> list = new ArrayList<String>();
				
		int index = 0;
		while(!br.readLine().equals("0 0 0"))
		{
			//split으로 자르면 안됨 
			//String[] str = br.readLine();
			/*
			for(int i=0;i<arr.length;i++)
			{
				String[] temp = str[i].split("");
				arr[index][i] = Integer.parseInt(temp[i]);
				
				int a = (int) Math.pow(arr[index][0], 2);
				int b = (int) Math.pow(arr[index][1], 2);
				int c = (int) Math.pow(arr[index][2], 2);
				
				if(a+b==c)
					list.add("right");
				else
					list.add("wrong");
					
				
			}*/
			index++;
		}
		
		for(String s : list)
			System.out.println(s);
	}
}
