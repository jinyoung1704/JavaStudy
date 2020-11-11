package level2;
import java.util.*;
//프로그래머스 올바른 괄호

public class S009
{
	public static void main(String[] args)
	{
		Solution_S009 sol = new Solution_S009();
		String s = "(())()";
		System.out.println(sol.solution(s));
	}
}

class Solution_S009 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
        char[] cha = s.toCharArray();
        
        for(int i=0;i<cha.length;i++)
        {
            if(cha[i]=='(')
            {  
                stack.add(i);
            }
            else
            {
                if(!stack.isEmpty())
                    stack.pop(); 
                else
                    return answer = false;
            }
            
        
        }
        
        if(stack.isEmpty())
            answer = true;
        else
            answer = false;
      
        return answer;
    }
}