package level2;
//프로그래머스 level2 프린터 
import java.util.*;

public class S026
{
	public static void main(String[] args)
	{
		Solution_S026 sol26 = new Solution_S026();
		int[] priorities = {2,1,3,2};
		int location = 2;
		System.out.println(sol26.solution(priorities, location));
	}
}

class Solution_S026 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int su : priorities)
            qu.add(su);
         
        while(!qu.isEmpty())
        {
            for(int i=0;i<priorities.length;i++)
            {    //System.out.println("확인=" + qu.peek());
                if(qu.peek()==priorities[i])
                {
                    //System.out.println(qu.peek());
                    qu.poll();
                    answer++;
                    if(location==i)
                    {
                        qu.clear();
                        break;
                    }
                }
            }
        }
        
        
        return answer;
    }
}