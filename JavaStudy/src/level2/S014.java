package level2;
//프로그래머스 주식가격

public class S014
{
	public static void main(String[] args)
	{
		Solution_S014 sol = new Solution_S014();
		int[] prices = {1,2,3,2,3};
		System.out.println(sol.solution(prices));
	}
}

class Solution_S014 {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            int count = 0;
            
            for(int j=i+1;j<prices.length;j++)
            {
                int su = prices[j];
                if(su>=prices[i])
                    count++;
                else 
                {
                    count++;
                    break;
                }    
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}