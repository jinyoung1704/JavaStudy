package level2;
/*
  124 나라의 문제
  
  124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

  124 나라에는 자연수만 존재합니다.
  124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
  예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
 */

public class S001
{
	
	public static void main(String[] args)
	{
		Solution_S001 solution_s001 = new Solution_S001();
		System.out.println(solution_s001.solution(10));
	}
}

class Solution_S001 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"4","1","2"};
        
        while(n>0)
        {
            answer = arr[n%3] + answer;
            n = (n-1)/3;
        }
        
        return answer;
    }
}
