package level2;
//프로그래머스 큰 수 만들기
import java.util.*;

public class S016
{
	public static void main(String[] args)
	{
		Solution_S016 sol = new Solution_S016();
		String number = "4177252841";
		int k = 4;
		System.out.println(sol.solution(number, k));
	}
}

class Solution_S016 {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        char[] word = new char[number.length()-k];
        
        for(int i=0;i<number.length();i++)
        {
            char cha = number.charAt(i);
            
            while(!stack.isEmpty() && stack.peek() < cha && k-->0)
            { //기존에 들어가 있는 것보다 비교하려는 문자가 더 크고 k가 0이 아닐때
                stack.pop(); //기존에 들어간 작은 수 제거
            }
            
            stack.push(cha);
        }
        
        for(int i=0;i<word.length;i++)
            word[i] = stack.get(i);
        
        for(char c : word)
            answer += c;
        
        return answer;
    }
}