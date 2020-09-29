package goorm;
//약수의 합
import java.io.*;

class Main_g011 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum += i;
		}
		
		sum += n;
		
		System.out.println(sum);
	}
}