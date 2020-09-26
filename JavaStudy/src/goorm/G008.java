package goorm;
import java.io.*;
//369게임

public class G008
{

}

class Main_g008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int su = Integer.parseInt(input);
		int count = 0;
		for(int i=3;i<su;i++)
		{
			String temp = String.valueOf(i);
			for(int j=0;j<temp.length();j++)
			{
				char num = temp.charAt(j);
				
				if (num=='3' || num =='6' || num == '9')
					count++;
			}
			
			
		}
		System.out.println(count);
	}
}