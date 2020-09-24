package goorm;

//구름-문자열 뒤집기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class G002
{
	
}

class Main_g002 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] arr = input.toCharArray();
		String answer = "";
		for(int i=arr.length-1;i>=0;i--)
			answer += arr[i];
		System.out.println(answer);
		
	}
}