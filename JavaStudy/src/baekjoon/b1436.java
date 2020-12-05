package baekjoon;
//백준 1436번 영화감독 숌
import java.util.Scanner;

public class b1436
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 666;
		int count = 1;
		
		while(n!=count)
		{
			num++;
			if(String.valueOf(num).contains("666"))
				count++;
		}
		System.out.println(num);
		sc.close();
	}
}
