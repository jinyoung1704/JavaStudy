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
            int su = 100 - progresses[i]; //남은 기능 %
            
            if(su%speeds[i]!=0) //나머지가 있으면 하루 추가
                su = (su/speeds[i]) + 1;
            else
                su = su/speeds[i];
            
            //System.out.println(su);
            arr[i] = su;
        }
        
       int max = arr[0]; 
       int count = 1;
      
       for(int i=1;i<arr.length;i++)
       { // 7 3 9
           if(arr[i]>max) //우선순위의 일보다 작업일이 더 걸릴경우
           {
               list.add(count); //기존 count 추가
               max = arr[i];  //max값 변경
               count=1; // 새롭게 끝내는 일이므로 1로 변경
           }
           else
           {
               count++; //우선순위의 일이 만료되야하므로 count만 추가
               continue;
               
           }
       }
        list.add(count); //마지막꺼에 대한 count 추가
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}