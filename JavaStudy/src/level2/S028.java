package level2;
//프로그래머스 더맵게
import java.util.*;

public class S028
{
	public static void main(String[] args)
	{
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		Solution_S028 sol28 = new Solution_S028();
		System.out.println(sol28.solution(scoville, K));
	}
}


class Solution_S028 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int su : scoville)
            pq.add(su);
        
        int count = 0;
        while(pq.peek()<K)
        {
            if(pq.size()==1)
                return -1;
        
            pq.add(pq.poll() + (pq.poll() * 2));
            count++;
        }
        
        answer = count;
        
        
        
        return answer;
    }
}