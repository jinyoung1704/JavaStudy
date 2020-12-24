package level1;
//프로그래머스 소수찾기

public class S030
{
	public static void main(String[] args)
	{
		int n = 10;
		int answer = 0;
		
		boolean[] check = new boolean[n+1];
		
		for(int i=2;i<=n;i++)
		{
			if(!check[i])
				answer++;
			
			for(int j=i;j<=n;j+=i)
			{
				if(!check[j])
					check[j] = true;
			}
		}
		
		System.out.println(answer);
	}
}
