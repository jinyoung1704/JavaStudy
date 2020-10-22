package baekjoon;
//프로그래머스 타켓넘버

class Solution
{
	static int target;
	static int[] numbers;
	static int answer;
	
    public int solution(int[] numbers, int target) 
    {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0);
        return answer;
    }
    
    public static void dfs(int v)
    {
        int sum = 0;
        if(v==numbers.length)
        {
            for(int num : numbers)   
                sum += num;
            
            if(sum==target)
                answer++;
            
            return;
        }
        
        numbers[v] *=1;
        dfs(v+1);
        
        numbers[v] *= -1;
        dfs(v+1);
    }
}
