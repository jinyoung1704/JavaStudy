package baekjoon;

public class b036
{
	
	
		public static void main(String[] args)
		{
			solution_b036 sol = new solution_b036();
		}
	

}

class solution_b036
{
	static int target;
	static int[] numbers;
	static int answer;
	
    public int solution(int[] numbers, int target) 
    {
        numbers = this.numbers;
        target = this.target;
        
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
        
        numbers[v+1] *=1;
        dfs(v+1);
        
        numbers[v+1] *= -1;
        dfs(v+1);
    }
}
