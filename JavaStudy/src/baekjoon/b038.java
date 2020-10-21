package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 2164번 카드2

public class b038
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		for(int i=1;i<=n;i++)
			qu.add(i);
		
		while(qu.size()>1)
		{
			qu.poll();  //첫번째값 제거
			
			qu.offer(qu.poll()); //첫번째 값 반환 후 제거
			
		}
		
		System.out.println(qu.poll()); //하나 남은 값 반환
		
	}
}
