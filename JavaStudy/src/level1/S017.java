package level1;
/*
 	s만큼 간격이 있는 문자
 	
 	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 */

public class S017
{

}

//내 코드 -=>13,14 에러
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0;i<answer.length;i++)
        {
            answer[i] = x;
            x += answer[0];
        }
            
        
        return answer;
    }
}
// x와 n의 숫자가 둘 다 큰 경우 x가 int 범위를 넘어가면 오류가 남

//다른 사람 풀이 
/*
 	class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;
        for(int i=0;i<answer.length;i++)
        {
            answer[i] = temp * (i+1);
        }
            
        
        return answer;
    }
}
 */
