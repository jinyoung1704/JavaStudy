package baekjoon;
//프로그래머스 깊이/너비 우선 탐색(DFS/BFS) >> 타겟 넘버


public class b033
{
	static int answer = 0;
	
	public int solution(int[] numbers, int target)
	{
		dfs(numbers,target,0);
		return answer;
	}
	
	public static void dfs(int[] numbers, int target, int node)
	{
		if(node==numbers.length)
		{
			int sum = 0 ;
			for(int num : numbers)
			{
				sum += num;
			}
			
			if(sum==target)
				answer++;
		}
		else
		{
			numbers[node] *= 1;
			dfs(numbers,target,node+1);
			
			numbers[node] *= -1;
			dfs(numbers,target,node+1);
		}
		
	}

}
