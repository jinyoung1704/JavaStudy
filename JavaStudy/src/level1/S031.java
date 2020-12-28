package level1;
//프로그래머스 해시 완주하지 못한 선수
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S031
{
	public static void main(String[] args)
	{
		Solution_S031 sol31 = new Solution_S031();
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		
		System.out.println(sol31.solution(participant, completion));
	}
}

class Solution_S031 {
    public String solution(String[] participant, String[] completion) {
    	 String answer = "";
         
         Arrays.sort(participant);
         Arrays.sort(completion);
         
         int i=0;
         for(i=0;i<completion.length;i++) //위에서 i 선언했기 때문에 여기다 int i 또 선언하면 에러
         {
             
             if(!participant[i].equals(completion[i]))
                 return participant[i];
             
         }
         
         return participant[i];
    }
}

// 효율성에서 통과안됨

/*
public String solution(String[] participant, String[] completion) {
String answer = "";
List<String> list = new LinkedList<String>();
for(String name : participant)
    list.add(name);

for(int i=0;i<completion.length;i++)
{
    if(list.contains(completion[i]))
    	list.remove(completion[i]);
}

for(String person : list)
	System.out.println(person);
return answer;
}*/