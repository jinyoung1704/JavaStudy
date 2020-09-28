package goorm;
//Min 함수
import java.io.*;

public class G016
{

}

class Main_g016 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int min = a;
		if(a>b)
			min = b;
		
		System.out.println(min);
	}
}