package level1;
/*
 	2016년
 
 	2016년 1월 1일은 금요일입니다. 
 	2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
    예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 */

public class S015
{
	public static void main(String[] args)
	{
		Solution_S015 s_015 = new Solution_S015();
		System.out.println(s_015.solution(5, 24));
	}
	
}

class Solution_S015 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDay = 0;
        for(int i=1;i<a;i++)
             totalDay += m[i-1] ;
        
        totalDay += b+4;
        
        
        answer = day[totalDay%7];
       
        
        return answer;
    }
}