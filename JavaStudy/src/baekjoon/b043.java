package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//백준 10845번 큐

public class b043
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> qu = new LinkedList<Integer>();
		int last=0;
		
		for(int i=1;i<=n;i++)
		{
			String str = br.readLine();
			
			
			if(str.contains("push"))
			{
				int su = Integer.parseInt(str.substring(5));
				qu.add(su);
				last = su;
				//System.out.println(str.substring(5));
			}
			else if(str.equals("pop"))
			{
				if(!qu.isEmpty())
					System.out.println(qu.poll());
				else
					System.out.println(-1);
				
			}
			else if(str.equals("size"))
				System.out.println(qu.size());
			else if(str.equals("empty"))
			{
				if(!qu.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
			}
			else if(str.equals("front"))
			{
				if(qu.isEmpty())
					System.out.println(-1);
				else
					System.out.println(qu.peek());
			}
			else if(str.equals("back"))
			{
				if(qu.isEmpty())
					System.out.println(-1);
				else
					System.out.println(last);
			}
				
		}
		
		//while(!qu.isEmpty())
			//System.out.println(qu.poll());
		
	}
}


//switch~case

/*
 	 switch (instruction[0]) {
            case "pop":
                if (q.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(q.poll()); // 제거 하며 읽기
                }
 
                break;
 
            case "push":
                x = Integer.parseInt(instruction[1]);
                last = x;
                q.offer(x);
                break;
 
            case "size":
                System.out.println(q.size());
                break;
 
            case "empty":
                if (q.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
                break;
 
            case "front":
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.peek());
                }
                break;
 
            case "back":
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(last);
                }
                break;
*/
