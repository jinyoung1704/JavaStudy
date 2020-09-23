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
            
            char[] cha = new char[s.length()];
            cha = s.toCharArray();
            for(int i=0;i<cha.length;i++)
            {
                char small ='a';
                char big = 'A';
                
                
                if(cha[i]<='Z' && cha[i]+n >'Z')
                {
                    cha[i] += n;
                	big += cha[i]-'Z' -1;
                	cha[i] = big;
                }
                else if(cha[i]>='a' && cha[i]+n >'z')
                {
                    cha[i] += n;
                	small += cha[i]-'z' -1;
                	cha[i] = small;
                }
               else if(cha[i]==' ')
                    cha[i] = ' ';
               else
                    cha[i]+= n;
                
                
                answer += cha[i];
            }

            
            return answer;
        }
    }

//다른 사람 풀이
/*
 	class Caesar {
    String caesar(String s, int n) {
    
        String result = "";
    
    	n = n % 26;
    	
    for (int i = 0; i < s.length(); i++)
    {
	      char ch = s.charAt(i);
	      
	      if (Character.isLowerCase(ch))//소문자일 때
	      {  
	        ch = (char) ((ch - 'a' + n) % 26 + 'a');
	      } 
	      else if (Character.isUpperCase(ch)) 대문자일 때
	      {
	        ch = (char) ((ch - 'A' + n) % 26 + 'A');
	      }
	      result += ch;
    }
         return result;
    }
 */

/*
 	int n = _n % 26;
 	
    if (c >= 'a' && c <= 'z')
    {
        return 'a' + (c - 'a' + n) % 26;
    } 
    else if (c >= 'A' && c <= 'Z')
    {
        return 'A' + (c - 'A' + n) % 26;
    } 
    else 
    {
        return c;
 */
