package goorm;
//문자열 번갈아 출력하기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class G014
{

}

class Main_g014 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] cha = input.toCharArray();
		int count = 1;
		int index = 0;
		int total = cha.length;
		
		String word = "";
		
		for(int i=0;i<cha.length;i++)
		{
			if(count%2!=0)
			{
				word += cha[index]; 
				count++;
				index++;
			}
			else
			{
				word += cha[total-index];
				count++;
			}
			
			
		}
		System.out.println(word);
		
	}
}