package level2;
//프로그래머스 문자열 압축

public class S011
{
	public static void main(String[] args)
	{
		String s = "abcabcdede";
		Solution_S011 sol = new Solution_S011();
		
		System.out.println(sol.solution(s));
	}
}

class Solution_S011 {
	public int solution(String s) {
        int answer = s.length();
        
        for(int i=1;i<=s.length()/2;i++) //반복되야하므로 문장의 반까지만
        {//하나씩 반복, 두개씩 반복...
            StringBuilder temp = new StringBuilder();
            
            for(int j=0;j<s.length();j=j+i) //앞에 부분
            {
                String word = "";
                
                if(j+i>=s.length())
                    word = s.substring(j,s.length());
                else
                    word = s.substring(j,j+i);
            
            
                int cnt = 1;
                StringBuffer sb = new StringBuffer();

                for(int k=j+i;k<s.length();k = k+i) //뒷부분
                {
                    String word2 = "";

                    if(k+i>=s.length())
                        word2 = s.substring(k,s.length());
                    else
                        word2 = s.substring(k,k+i);
                

                    if(word.equals(word2))
                    {
                        cnt++;
                        i = j;
                    }
                    else
                        break;  
                }    
                
                if(cnt==1)
                sb.append(word);
                else
                sb.append(cnt).append(word);
                
                
                temp.append(sb.toString());
               
            }
            
            answer = Math.min(answer, temp.toString().length());
           
        }
        
        return answer;
    }
}