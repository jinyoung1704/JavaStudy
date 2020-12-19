package level2;
import java.util.*;
//프로그래머스 최댓값과 최솟값
public class S029
{
	public static void main(String[] args)
	{
		String s = "1 2 3 4";
		Solution_S029 sol29 = new Solution_S029();
		System.out.println(sol29.solution(s));
		
	}
}


class Solution_S029 {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] temp = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
            temp[i] = Integer.parseInt(arr[i]);
        
        Arrays.sort(temp);
        answer += Integer.toString(temp[0]) + " ";
        answer += Integer.toString(temp[temp.length-1]);
     
        return answer;
    }
}

/* 다른 사람 풀이 
public String getMinMaxString(String str) {
    String[] tmp = str.split(" ");
    int min, max, n;
    min = max = Integer.parseInt(tmp[0]);
    for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
        if(min > n) min = n;
        if(max < n) max = n;
    }

    return min + " " + max;

}
*/