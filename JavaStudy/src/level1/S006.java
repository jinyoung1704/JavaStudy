package level1;
/*
 	같은 숫자는 싫어
 	(다른 사람 풀이)
 */

import java.util.ArrayList;

public class S006
{
	public static int[] main(int[] arr)
	{

		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
        int preNum = 10; // arr[0]번째를 담기 위해
        for(int num : arr)
        {
            if(preNum != num) 
                tempList.add(num);
            preNum = num; //방금 넣은 수로 바꾸기 => 그래야 다음 arr의 수가 일치하면 안 들어가므로
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;


	}
}

//다시 풀어봄
/*
  ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        int checkNum = 10;
        for(int temp : arr)
        {
            if(checkNum != temp)
                tempList.add(temp);
            checkNum = temp;
        }
        
        int[] answer = new int[tempList.size()];
        for(int i=0;i<answer.length;i++)   //ArrayList는 size()!, tempList.length로 쓰면 오류 난다
            answer[i] = tempList.get(i).intValue();
        

        return answer;
*/

