package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//백준 10816번 숫자 카드2
public class b10816
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] count = new int[20000001]; //숫자 범위가 -10,000,000 ~ 10,000,000 이므로
		
		for(int i=0;i<N;i++)
			count[Integer.parseInt(st.nextToken()) + 10000000 ]++;
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<M;i++)
		{
			sb.append(count[Integer.parseInt(st.nextToken())+ 10000000] + " ");
		}
		
			System.out.print(sb);
		
	}
}
