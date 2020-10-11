package level1;
//시저암호

public class Test1
{
	public static void main(String[] args)
	{
		Solution_Test1 st = new Solution_Test1();
		System.out.println(st.solution("a B z", 4));
	}
}

class Solution_Test1 {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] cha = s.toCharArray();
        
        for(int i=0;i<cha.length;i++)
        {
        	if((cha[i]>=65 && cha[i]<=92) || (97<=cha[i] && cha[i]<=122))
        		cha[i] += n;
        	 
            
            if(cha[i]>122)  
                cha[i]-= 26;
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<cha.length;i++)
            sb.append(cha[i]);
        
        answer = sb.toString();
        
        return answer;
    }
}
//--==> 제출 시 테스트 오류

//정답


class Solution_t {
    public String solution(String s, int n) {
        String answer = "";

        char[] cha = s.toCharArray();

        for(int i=0;i<cha.length;i++)
        {
            if(cha[i]>=65 && cha[i]<=92) 
                cha[i] = (char)((cha[i]-'A'+n)%26 + 'A');
            else if(97<=cha[i] && cha[i]<=122)
                cha[i] = (char)((cha[i]-'a'+n)%26 + 'a');


        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<cha.length;i++)
            sb.append(cha[i]);

        answer = sb.toString();

        return answer;
    }
}
