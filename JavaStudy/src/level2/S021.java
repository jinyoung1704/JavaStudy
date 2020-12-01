package level2;

public class S021
{

}

class Solution_S021 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); 

       if(s.substring(s.length()-1).equals(" "))
            str[str.length-1] += " ";

        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char cha = str[i].charAt(j);

                if(j!=0 && cha>=65 && cha<=91) 
                    cha += 32; 

                if(j==0 && cha>=97 && cha<=121) 
                    cha -= 32; 

                System.out.println(cha);
                answer += cha;
            }


              answer += " ";

        }

        answer = answer.substring(0,answer.length()-1);

        return answer;
    }
} 

/*
 	class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] str = s.split(" ");
        System.out.println(str.length);
        if((s.substring(s.length()-1)).equals(" "))
            str[str.length-1] +=" ";
        
        
        
       for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char c = str[i].charAt(j);
                if(j==0 && c>=97&& c<=121 )
                {
                    c -= 32;
                    answer += c;
                    continue;
                }
                
                 answer += str[i].charAt(j);
            }
            
            
              answer += " ";
            
        }
        
        answer = answer.substring(0,answer.length()-1);
        return answer;
    }
}
 */
