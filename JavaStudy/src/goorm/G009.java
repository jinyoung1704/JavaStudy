package goorm;
import java.io.*;
//의좋은 형제(다시풀기)
public class G009
{

}

class Main_g009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] temp = input.split(" ");
		int day = Integer.parseInt(br.readLine());
		//System.out.println(day);
		int[] arr = new int[2];
		for(int i=0;i<temp.length;i++)
		{
			arr[i] = Integer.parseInt(temp[i]);
		}
		//System.out.println(arr[0]);
		//System.out.println(arr[2]);
		int jin = arr[0];
		int sun = arr[1];
		
		for(int i=1;i<=day;i++)
		{
			int su = 0;
			if(i%2!=0)
			{
				su = jin/2;
				//System.out.println(su);
				jin -= su;
				sun += su;
			}
			else
			{
				su = arr[1]/2;
				jin += su;
				sun -= su;
			}
		}
		
		System.out.print(jin + " " + sun);
	}
}