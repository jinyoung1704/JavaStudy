package level1;
/*
 	자릿수 더하기
 	
 	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class S020
{
	public static void main(String[] args)
	{
		Solution_S020 s020 = new Solution_S020();
		System.out.println(s020.solution(198));
	}
}

class Solution_S020 {
    public int solution(int n) {
        int answer = 0;
        char[] temp = String.valueOf(n).toCharArray();
       
        for(char cha : temp)
            answer += (int)cha-48;

        return answer;
    }
}

//다른 사람 풀이
/*
 	public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
 */
