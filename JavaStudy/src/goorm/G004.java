package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//3과 5의 배수

public class G004
{

}

class Main_g004 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int su = Integer.parseInt(input);
		int sum = 0;
		for(int i=3;i<=su;i+=3)
			sum += i;
		for(int i=5;i<=su;i+=5)
			sum += i;
		for(int i=15;i<=su;i+=15)
			sum -= i;
		System.out.println(sum);
	}
}
