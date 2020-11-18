package level3;
//프로그래머스 거스름돈 (dp문제)
public class S007
{
	public static void main(String[] args)
	{
		Solution_S007 sol = new Solution_S007();
		int n = 5;
		int[] money = {1,2,5};
		System.out.println(sol.solution(n, money));
	}
}

class Solution_S007 {
    public int solution(int n, int[] money) {
        int[] answer = new int[100001];
        answer[0] = 1;
        for(int i : money)
        {
            for(int j=i;j<=n;j++)
            {
                //System.out.print("j : "+j);
                answer[j] += answer[j-i];
                //System.out.println("answer[j] : " + answer[j]);
            }
        }
        
        return answer[n];
    }
}