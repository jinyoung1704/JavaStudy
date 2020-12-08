package level2;
//프로그래머스 level2 주식가격 

public class S025
{
	public static void main(String[] args)
	{
		Solution_S025 s = new Solution_S025();
		int[] prices = {1,2,3,2,3};
		System.out.println(s.solution(prices));
	}
}

class Solution_S025 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0;i<prices.length;i++)
        {
            int count = 0;
            int p = prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                if(p<=prices[j])
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