package level2;
//프로그래머스 다음 큰 숫자

public class S012
{
	public static void main(String[] args)
	{
		int n = 78;
		Solution_S012 sol = new Solution_S012();
		System.out.println(sol.solution(n));
	}
}

class Solution_S012 {
    public int solution(int n) {
        int answer = n;
        int count = 0;
        String su = Integer.toBinaryString(n); //2진수로 바꿔줌
        for(char cha : su.toCharArray())
        {
            if(cha=='1')
                count++;
        }
        
        for(answer=n+1;answer<=1000000;answer++)
        {
            su = Integer.toBinaryString(answer);
            int cnt = 0;
            for(char cha : su.toCharArray())
            {
                if(cha=='1')
                    cnt++;
            }
            
            if(count==cnt)
                return answer;
        }
        return answer;
    }
}