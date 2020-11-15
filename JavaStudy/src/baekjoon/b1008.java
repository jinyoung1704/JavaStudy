package baekjoon;
//백준 1008번 A/B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1008
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		int A = Integer.parseInt(temp[0]);
		int B = Integer.parseInt(temp[1]);
		
		double result = A/(double)B;
		System.out.println(result);
		
	}
}
