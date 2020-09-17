package level1;
/*
 	제일 작은 수 제거하기
 	
 	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
public class S023
{
	public static void main(String[] args)
	{
		Solution_S023 s023 = new Solution_S023();
		
	}

}


class Solution_S023 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1)
        {
            answer= new int[1];
            answer[0] = -1;
        }
        else 
        {
            int min = arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i+1]<min)
                    min = arr[i+1];
            }
            System.out.println(min);
            answer = new int[arr.length-1];
            int count = 0;
            for(int i=0;i<arr.length;i++) //처음에 answer.length 로 했었는데 그러면 길이가 3인 answer에 0,1,2까지만 돌아서 오류났음
            {
                if(arr[i]!=min)
                {
                    answer[count++] = arr[i];
                }
            }
        }
         return answer;
    }
}

//다른 사람 풀이
/*
 class Solution {
  public int[] solution(int[] arr) {
      if(arr.length <= 1){
        int[] answer = {-1};    
          return answer;
      }

      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

      int[] answer = new int[arr.length-1];
      int index = 0;

      for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }
      return answer;
  }
}
 	
 */
