package level2;
//프로그래머스 가장 큰 수
import java.util.*;

public class S013
{
	public static void main(String[] args)
	{
		Solution_S013 sol = new Solution_S013();
		int[] numbers = {6,10,2};
		System.out.println(sol.solution(numbers));
	}
}


class Solution_S013 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
       
         for(int i=0;i<numbers.length;i++)
                str[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(str, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return (o2+o1).compareTo(o1+o2); //내림차순
            }
        });
        
        if(str[0].startsWith("0")) //0으로 시작하면
        {
            answer += "0";
        }
        else
        {
            for(int i=0;i<str.length;i++)
                answer += str[i];
        }
        
        
       
       return answer;
    }
}