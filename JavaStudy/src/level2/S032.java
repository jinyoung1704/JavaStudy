package level2;
//프로그래머스 정렬 - H-index
import java.util.Arrays;

public class S032
{
	public static void main(String[] args)
	{
		int[] citations = {3,0,6,1,5};
		Solution_S032 sol32 = new Solution_S032();
		System.out.println(sol32.solution(citations));
	}
}


class Solution_S032 {
    public int solution(int[] citations) {
        int answer = 0;
    
        Arrays.sort(citations);
        
        
        for(int i=0;i<citations.length;i++)
        {
            int n = citations.length - i;
        
            if(citations[i]>=n)
            {
                answer = n;
                break;
            }
        }
        return answer;
    }
}