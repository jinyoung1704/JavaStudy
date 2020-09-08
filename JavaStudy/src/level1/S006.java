package level1;
/*
 	같은 숫자는 싫어
 	(다른 사람 풀이)
 	
 	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
	예를 들면,
	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
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

