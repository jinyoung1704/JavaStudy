package level2;
//프로그래머스 기능개발

import java.util.*;

public class S007
{
	public static void main(String[] args)
	{
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		
		Solution_S007 sol = new Solution_S007();
		System.out.println(sol.solution(progresses, speeds));
	}
}

class Solution_S007 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[progresses.length];
        for(int i=0;i<progresses.length;i++)
        {
            int su = 100 - progresses[i];
            
            if(su%speeds[i]!=0)
                su = (su/speeds[i]) + 1;
            else
                su = su/speeds[i];
            //System.out.println(su);
            arr[i] = su;
        }
        
       int max = arr[0];
       int count = 1;
       //System.out.println(max);
       for(int i=1;i<arr.length;i++)
       { // 7 3 9
           if(arr[i]>max)
           {
               list.add(count);
               max = arr[i];
               count=1;
           }
           else
           {
               count++;
               continue;
               
           }
       }
        list.add(count);
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}