package baekjoon;
//백준 b10951번 A+B-4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10951
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) !=null)
		{
			String[] temp = str.split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			sb.append(a+b +"\n");
		}
		
		
		System.out.print(sb.toString());
	}
}

/* 다른 풀이 
 		Scanner in=new Scanner(System.in);
			
		while(in.hasNextInt()){
		
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
*/
