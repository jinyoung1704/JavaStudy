package goorm;
import java.io.*;

//완전수
public class G013
{

}

class Main_g013 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] range = input.split(" ");
		int start = Integer.parseInt(range[0]);
		int end = Integer.parseInt(range[1]);
	
		for(int i=start;i<=end;i++)
		{
			int sum = 0;
			for(int j=1;j<=i/2;j++)
			{ 
				if(i%j==0)
					sum += j;
			}
			if(sum==i)
				System.out.print(i+" ");
			
		}
		
	}
}