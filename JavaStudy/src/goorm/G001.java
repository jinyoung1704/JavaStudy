package goorm;
import java.io.*;
public class G001
{
	
}

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
	
		boolean check = true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{	
				check = false;
				break;
			}
		
		}
		
		System.out.println(check==false ? "False" : "True");
	}
}