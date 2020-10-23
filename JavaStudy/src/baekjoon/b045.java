package baekjoon;
//백준 10866번 덱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class b045
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> dec = new ArrayDeque<Integer>();
		
		for(int i=1;i<=n;i++)
		{
			String[] str = br.readLine().split(" ");
			
			switch (str[0])
			{
			case "push_front":
				dec.addFirst(Integer.parseInt(str[1]));
				break;

			case "push_back" :
				dec.addLast(Integer.parseInt(str[1]));
				break;
				
			case "pop_front" :
				if(!dec.isEmpty())
					System.out.println(dec.pop()); //Stack의 pop과 동일 removeFirst()
				else
					System.out.println(-1);
				break;
			case "pop_back" :
				if(!dec.isEmpty())
				{
					System.out.println(dec.peekLast()); //마지막 값을 찍고
					dec.pollLast(); //제거
				}
				else
					System.out.println(-1);
				break;
				
			case "size" :
				System.out.println(dec.size());
				break;
				
			case "empty" : 
				if(!dec.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
				break;
				
			case "front" : 
				if(!dec.isEmpty())
					System.out.println(dec.peekFirst());
				else
					System.out.println(-1);
				break;
			case "back" : 
				if(!dec.isEmpty())
					System.out.println(dec.peekLast());
				else
					System.out.println(-1);
				break;
				
			default:
				break;
			}
		}
	}
}
