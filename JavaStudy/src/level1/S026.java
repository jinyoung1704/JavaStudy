package level1;
import java.util.*;
// 정수 내림차순으로 배치하기
/*
 	함수 solution은 정수 n을 매개변수로 입력받습니다. 
 	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 	예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */

public class S026
{
	public static void main(String[] args)
	{
		Solution_S026 s026 = new Solution_S026();
		System.out.println(s026.solution(118372));
	}
}


class Solution_S026 {
    public long solution(long n) {
    	
        long answer = 0;
        String word = n + "";
        String[] str = word.split("");
        Integer[] arr = new Integer[str.length];
        for(int i=0;i<arr.length;i++)
            arr[i] = Integer.parseInt(str[i]);
        
        Arrays.sort(arr,Collections.reverseOrder());
      
        StringBuilder sb = new StringBuilder();
        
		for (int i = 0;i<arr.length;i++) 
			sb.append(arr[i]);
		
		answer = Long.parseLong(sb.toString());

        return answer;
    }
}

/*
 	public class ReverseInt {
    public int reverseInt(int n){
        String arr[]=String.valueOf(n).split("");

        Arrays.sort(arr);
        String str = "";

        for(int i=arr.length-1; i>=0; i--){
             str+= arr[i];
        }

        return Integer.parseInt(str);
    }

 */
