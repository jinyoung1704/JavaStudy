package goorm;
//모양 찍기

import java.io.*;

public class G017
{

}

class Main_g017 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}
}
