package level2;
//프로그래머스 level2 다음 큰 숫자
public class S024
{
	public static void main(String[] args)
	{
		Solution_S024 sol24 = new Solution_S024();
		int n = 78;
		System.out.println(sol24.solution(n));
	}
}

class Solution_S024 {
    public int solution(int n) {
        int answer = 0;
        String su = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<su.length();i++)
        {
            if(su.charAt(i)=='1')
                count++;
        }
        
        for(int i=n+1;i<=1000000;i++)
        {
            int count2 = 0;
            
            String nextSu = Integer.toBinaryString(i);
           
            for(int j=0;j<nextSu.length();j++)
            {
                if(nextSu.charAt(j)=='1')
                    count2++;
            }
            
            if(count2 == count)
            {
                answer = i;
                break;
            }
        }
        return answer;
    }
}