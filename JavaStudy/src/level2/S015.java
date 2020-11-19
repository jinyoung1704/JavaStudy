package level2;
//프로그래머스 숫자의 표현

public class S015
{
	public static void main(String[] args)
	{
		Solution_S015 sol = new Solution_S015();
		int n = 15;
		System.out.println(sol.solution(n));
	}
}

class Solution_S015 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++)
        {
            int sum = 0;
            for(int j=i;j<=n;j++)
            {
                sum += j;
                
                if(sum==n)
                {
                    answer++;
                    break;
                }
                else if(sum>n)
                    break;
                
            }
        }
        
        return answer;
    }
}