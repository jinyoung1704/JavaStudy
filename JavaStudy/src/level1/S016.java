package level1;
/*
 	핸드폰 번호 가리기
 	
 	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 
	전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, 
	solution을 완성해주세요.
  
 */

public class S016
{
	public static void main(String[] args)
	{
		Solution_S016 s016 = new Solution_S016();
		System.out.println(s016.solution("01099876543"));
	}
}

class Solution_S016 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0;i<phone_number.length()-4;i++)
                answer += "*";
       answer += phone_number.substring(answer.length());
        
        return answer;
    }
}

//다른 사람 풀이
/*
 	
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
 */
