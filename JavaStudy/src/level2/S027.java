package level2;
//프로그래머스 전화번호목록

public class S027
{
	public static void main(String[] args)
	{
		Solution_S027 sol27 = new Solution_S027();
		String[] phone_book = {"119","97674223","1195524421"};
		System.out.println(sol27.solution(phone_book));
	}
}

class Solution_S027 {
    public boolean solution(String[] phone_book) {
        //boolean answer = true;
        for(int i=0;i<phone_book.length-1;i++)
        {
            for(int j=i+1;j<phone_book.length;j++)
            {
                if(phone_book[i].startsWith(phone_book[j]))
                    return false;
                if(phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        return true;
    }
}