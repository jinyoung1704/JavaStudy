package level2;
//프로그래머스 level2 기능개발

import java.util.*;
public class S023
{
	public static void main(String[] args)
	{
		int[] progresses = {90,30,55};
		int[] speeds = {1,30,5};
		Solution_S023 sol23 = new Solution_S023();
		System.out.println(sol23.solution(progresses, speeds));
	}
}

class Solution_S023 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] arr = new int[progresses.length];
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i]!=0)
                arr[i] += 1;
        }
        
       // for(int i : arr)
       //     System.out.println(i);
        
        int max = arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(max>=arr[i])
                count++;
  
            else
            {
                max = arr[i];
                qu.add(count);
                count = 1;    
            }   
            
            
        }   
        
        qu.add(count);
        answer = new int[qu.size()];
        
        for(int i=0;i<answer.length;i++)
            answer[i] = qu.poll();
        
        return answer;
    }
}