package baekjoon;
//백준 10869번 사칙연산

import java.util.Scanner;

public class b10869
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(A+B+"\n");
		sb.append(A-B+"\n");
		sb.append(A*B+"\n");
		sb.append(A/B+"\n");
		sb.append(A%B);
		
		System.out.println(sb.toString());
	}
}
