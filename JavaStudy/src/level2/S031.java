package level2;
//프로그래머스 전화번호 목록

public class S031
{
	public static void main(String[] args)
	{
		String[] phone_book = {"119","97674223","1195524421"};
		Solution_S031 sol31 = new Solution_S031();
		System.out.println(sol31.solution(phone_book));
	}
}

class Solution_S031 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0;i<phone_book.length-1;i++)
        {
        	for(int j=i+1;j<phone_book.length;j++)
        	{
        		if(phone_book[i].startsWith(phone_book[j]))
        			answer = false;
        		else if(phone_book[j].startsWith(phone_book[i]))
        			answer = false;
        	}
        }
        
        return answer;
    }
}