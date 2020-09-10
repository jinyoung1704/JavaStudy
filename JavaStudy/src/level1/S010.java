package level1;
/*
 	문자열 내 p와 y의 개수
 	
 	대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
    다르면 False를 return 하는 solution를 완성하세요. 
    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
    단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

	예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
 */

public class S010
{
	public static void main(String[] args)
	{
		Solution_010 solution = new Solution_010();
		System.out.println(solution.solution("PyuP"));
	}
}

class Solution_010 {
    boolean solution(String s) {
        boolean answer = false;

        char[] arr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='p' || arr[i]=='P')
                pCount++;
            else if(arr[i]=='y' || arr[i]=='Y')
                yCount++;    
        }
        
        if(pCount==yCount || (pCount==0 && yCount==0))
            answer = true;        

        return answer;
    }
}

//다른 사람 풀이
/*

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}
 */
