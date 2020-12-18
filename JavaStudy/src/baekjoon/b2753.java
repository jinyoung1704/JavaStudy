package baekjoon;
//백준 2753번 윤년

import java.io.InputStreamReader;
import java.util.Scanner;

public class b2753
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int year = sc.nextInt();
		
		int result = (year%4==0 && year%100!=0 || year%400==0) ? 1 : 0;
		System.out.println(result);
		sc.close();
	}
}
