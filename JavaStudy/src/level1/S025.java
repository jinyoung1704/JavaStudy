package level1;

/*
 	자연수 뒤집어 배열로 만들기
 	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
 	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class S025
{
	public static void main(String[] args)
	{
		Solution_S025 s025 = new Solution_S025();
		System.out.println(s025.solution(12345));
	}
}

class Solution_S025 {
    public int[] solution(long n) {
        
        String word = n + "";
        //System.out.println(word);
        int[] answer = new int[word.length()];
        int cnt = 0;
        while(n>0)
        {
        	answer[cnt++] = (int)(n%10); // (int)n%10; ==> 실패 케이스 몇 개 생김 int 범위를 넘어간 long이어서 그런가?
        	n /= 10;
        	
        	
        }
        return answer;
    }
}

/* 다른 사람 풀이
class Solution {
public int[] solution(long n) {
    String s = String.valueOf(n);
    StringBuilder sb = new StringBuilder(s);
    sb = sb.reverse();
    String[] ss = sb.toString().split("");

    int[] answer = new int[ss.length];
    for (int i=0; i<ss.length; i++) {
        answer[i] = Integer.parseInt(ss[i]);
    }
    return answer;
}
}
*/