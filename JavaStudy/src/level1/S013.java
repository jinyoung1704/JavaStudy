package level1;
/*
  	시저 암호 
  	
 	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
 	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */
import java.util.*;
public class S013
{
	public static void main(String[] args)
	{
		Solution_S013 solution_s013 = new Solution_S013();
		System.out.println(solution_s013.solution("a B z", 4));
	}
	
	

}

class Solution_S013 {
    public String solution(String s, int n) {
        String answer = "";
        char small ='a';
        char big = 'A';
        char[] cha = new char[s.length()];
        cha = s.toCharArray();
        for(int i=0;i<cha.length;i++)
        {
        	System.out.println(cha[i]);
        	if(cha[i]!=' ')
        		cha[i] += n;
            //System.out.println('A' + cha[i]-'Z');
            if(cha[i]>'Z' && cha[i]<'a')
            {
            	big += cha[i]-'Z' -1;
            	cha[i] = big;
            }
            else if(cha[i]>'z')
            {
            	small += cha[i]-'z' -1;
            	cha[i] = small;
            }
                   
            
            answer += cha[i];
        }

        
        return answer;
    }
}