package goorm;
//홀짝 판별
import java.io.*;

public class G005
{

}

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int su = Integer.parseInt(input);
			System.out.println(su%2==0 ? "even" : "odd");


	}
}