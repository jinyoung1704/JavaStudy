package baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b1966
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-->0)
		{
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int answer =0;
			
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			PriorityQueue<Integer> qu = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			for(int su : arr)
				qu.add(su);
			
			while(!qu.isEmpty())
			{
				for(int i=0;i<arr.length;i++)
				{
					if(qu.peek()==arr[i])
					{
						qu.poll();
						answer++;
						
						if(i==m)
						{
							qu.clear();
							break;
						}
					}
					
				}
				
			}
			System.out.println(answer);
		}
		sc.close();
	}
}
