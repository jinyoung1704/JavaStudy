package level2;
//프로그래머스 level2 JadenCase 문자열 만들기

public class S010
{
	
}

class Solution_S010 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); //단어별로 자름
       
        //공백이 있는지 확인(s의 맨마지막의 공백이면 공백을 넣어줌)
       // System.out.println(s.substring(s.length()-1));
       if(s.substring(s.length()-1).equals(" "))
            str[str.length-1] += " ";
        
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char cha = str[i].charAt(j);
                //System.out.println(cha);
                
                if(j!=0 && cha>=65 && cha<=91) //첫번째 문자가 아니고 대문자이면
                    cha += 32; //소문자로 변환
                
                if(j==0 && cha>=97 && cha<=121) //첫번째 문자가 대문자이면
                    cha -= 32; //소문자로 변환
               
                System.out.println(cha);
                answer += cha;
            }
            
            
              answer += " ";
            
        }
      
        answer = answer.substring(0,answer.length()-1);
        
        return answer;
    }
}