package level1;
/*
 	문자열을 정수로 바꾸기
 	
 	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 */
public class S014
{
	public static void main(String[] args)
	{
		Solution_s014 s_014 = new Solution_s014();
		System.out.println(s_014.solution("1234"));
	}
}

class Solution_s014 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}