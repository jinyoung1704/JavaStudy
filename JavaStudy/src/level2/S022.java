package level2;
import java.util.Stack;
//프로그래머스 올바른 괄호
public class S022
{
	public static void main(String[] args)
	{
		Solution_S022 so = new Solution_S022();
		String s = "(())()";
		System.out.println(so.solution(s));
	}
}


class Solution_S022 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char cha = s.charAt(i);
            
            if(cha=='(')
                stack.push('(');
            else
            { 
                if(!stack.isEmpty())
                    stack.pop();
                else
                    stack.push(')');
        
            }
            
            
        }
        
        if(stack.isEmpty())
             answer = true;
        else
             answer = false;
        
        return answer;
    }
}