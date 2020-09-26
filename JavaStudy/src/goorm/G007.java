package goorm;
import java.io.*;
//리그 경기 횟수 구하기

public class G007
{

}

class Main_g007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int su = Integer.parseInt(input);
		int sum = 0;
		while(su>1)
		{
			sum += su-1;
			su--;
		}
		System.out.println(sum);
	}
}