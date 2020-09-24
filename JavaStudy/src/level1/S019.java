package level1;
/*
 	히샤드 수
 	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */

public class S019
{
	
	public static void main(String[] args)
	{
		Solution_S019 s019 = new Solution_S019();
		System.out.println(s019.solution(189));
	}
	
}


class Solution_S019 {
    public boolean solution(int x) {
        boolean answer = true;
        String word = Integer.toString(x);
        char[] arr = word.toCharArray();
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += (arr[i])-48;
        }

        if(x%sum!=0)
            answer =false;
        return answer;
    }
}

//다른 사람 풀이
/*
 	 String[] temp = String.valueOf(n).split("");

    int sum = 0;
    for (String s : temp) {
        sum += Integer.parseInt(s);
    }

    if (num % sum == 0) {
        return true;
    } else {
      return false;
    }
    
 */
