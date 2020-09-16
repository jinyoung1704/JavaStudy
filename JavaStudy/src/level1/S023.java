package level1;

public class S023
{
	public static void main(String[] args)
	{
		Solution_S023 s023 = new Solution_S023();
		System.out.println(s023.solution([3,4,2,5]);
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
            for(int i=0;i<answer.length;i++)
            {
                if(arr[i]!=min)
                    answer[i] = arr[i];
                
            }
        }
         return answer;
    }
}