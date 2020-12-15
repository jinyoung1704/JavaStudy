package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 10250번 ACM 호텔

public class b10250
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int count = Integer.parseInt(br.readLine());
		
		while(count-->0)
		{
			String[] str = br.readLine().split(" ");
			
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			if(n%h==0)
				System.out.println(h*100+(n/h));
			else
				System.out.println((n%h)*100 + (n/h)+1);
		}
		
	
	}
}


/* 처음에 내가 푼 풀이 => 답은 나오나 비효율적, 백준에서는 틀렸다고 함
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<String>();
		
		while(count-->0)
		{
			String[] str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			list.add(hotel(h,w,n));
			
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	public static String hotel(int h,int w,int n)
	{
		String result ="";
		while(n>0)
		{
			for(int i=1;i<=w;i++)
			{
				for(int j=1;j<=h;j++)
				{
					n--;
					
					if(n==0)
					{
						result = j+"0"+i;
						//System.out.println(j+"0"+i);
						return result;
					}
				}
			}
			
			
		}
		//return n;
		return result;
	
 */
