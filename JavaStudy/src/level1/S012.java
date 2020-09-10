package level1;
/*
 	나누어 떨어지는 숫자 배열
 	
 	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */

import java.util.ArrayList;
import java.util.Collections;

class S012
{
	public static void main(String[] args)
	{
		Solution_S012 solution_012 = new Solution_S012();
	}
	
}

class Solution_S012 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%divisor==0)
                temp.add(arr[i]);
        }
        
       
        if(temp.size()==0)
        {
             answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[temp.size()];
        
            Collections.sort(temp);
            for(int i=0;i<answer.length;i++)
                answer[i] = temp.get(i);
            
            
            
        }
             
            
            
        
        return answer;
    }
}