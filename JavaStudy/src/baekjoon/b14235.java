package baekjoon;
//백준 14235번 크리스마스 선물 
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b14235
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); //이거를 안 쓰면 공백이 하나 더 들어가서 n이 5개일 때 4개밖에 
		               //입력이 안됨. 이거를 써줌으로써 개행 제거
		PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder()); //우선순위큐에서 Collections.reverseOrder() 체크!
		StringBuffer sb = new StringBuffer();
		
		while(n-->0)
		{
			String temp = sc.nextLine(); // 한문장으로 인식. next()는 엔터칠 때 마다 띄어쓰기로 인식
			
				
			if(temp.equals("0"))
			{
				if(!qu.isEmpty())
				{
					sb.append(qu.poll() + "\n");
				}
				else
					sb.append(-1 + "\n");
			}
			else
			{
				String[] st = temp.split(" ");
				for(int i=1;i<st.length;i++)
					qu.add(Integer.parseInt(st[i]));
				
			}
			
		}
		
		
		System.out.println(sb);
	}
}
