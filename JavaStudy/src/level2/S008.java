package level2;
//프로그래머스 조이스틱
public class S008
{

}

class Solution_S008 {
	public int solution(String name) {
        int answer = 0;
        char[] cha = name.toCharArray();
        int len = name.length();
		int min = len-1; //오른쪽으로 이동하는 커서 움직임
        
        for(int i=0;i<cha.length;i++)
        { //65+26 = 91
        
            if(cha[i]>65+13) //반이 지난 시점(뒤에서 부터 세는게 더 빠른 경우)
            {
                ++answer; //A->Z 한 칸 이동
                answer += 90- cha[i];
            }
            else if(cha[i]<=65+13)
                 answer += cha[i] -65;
          
            
            int next = i+1;
            //다음 문자가 있고 A인 경우
			while(next<len && cha[next]=='A')
            {
				++next;
			}
            
			min = Math.min(min,i+len-next+Math.min(i,len-next));
            //오른쪽으로 한칸씩 커서를 이동하는 것과
            //현재 인덱스와 뒤에서 남은 인덱스 + 지금까지 온 것만큼 돌아가는 것이 나은지
			// 돌아갈 필요가 없는지를 비교해서 둘 중 작은 것을 선택
            System.out.println(min);
            //System.out.println(answer);
        }
        
        return answer+min; 
    }
}

/*
//2. 좌우: 연속된 A의 등장에 따라 달라지는 최소 움직임
 * 
			int next = i+1;
			while(next<len && name.charAt(next)=='A') {
				++next;
			}
			min_move = Math.min(min_move,i+len-next+Math.min(i,len-next));
			// len - next : 
			// 총 길이에서 현재 바로 다음에 연속된 A가 지나고 남은 문자 갯수
			// i : 오른쪽으로의 현재까지의 이동횟수
			// i + len - next + i : 현재까지 왔다가 다시 돌아가서 남은 거 까지 가는 이동 횟수
			// min(i,len-next)에서,
			// i 보다 len-next 값이 작은 경우에 len-next를 선택하는데
			// 이는, 마지막 문자가 A인 경우를 제외 하면
			// 무조건 len-1 보다 크게 된다 (len-next >=1)
			// 따라서,i가 len-next(남은 문자)보다 큰 경우는
			// 굳이 왼쪽으로 다시 돌아갈 필요가 없다.
			// 대신 끝이 A인 경우는, len-next가 0이 되므로,
			// 무조건 len-1 보다 작은 i 가 최소 이동횟수가 된다.
			// 따라서 Math.min(i,len-next) 이 부분은 식에서 필요하게 된다.
*/