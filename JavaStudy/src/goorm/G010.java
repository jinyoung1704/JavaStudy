package goorm;
import java.io.*;
//특정구간의 합
public class G010
{

}

class Main_g010 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		int[] arr = new int[n];
		String[] su = br.readLine().split(" ");
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(su[i]);
		int sum = 0;
		
		String[] range = br.readLine().split(" ");
		int start = Integer.parseInt(range[0])-1;
		int end = Integer.parseInt(range[1])-1;
		//System.out.println(start);
		for(int i=start;i<=end;i++)
			sum += arr[i];
		System.out.println(sum);
	}
}