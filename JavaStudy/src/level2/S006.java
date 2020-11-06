package level2;
//프로그래머스 땅따먹기
import java.util.*;

public class S006
{
	public static void main(String[] args)
	{
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		Solution_s006 sol = new Solution_s006();
		System.out.println(sol.solution(land));
	}

}


class Solution_s006 {
    int solution(int[][] land) {
        int answer = 0;
        
        for(int i=1;i<land.length;i++)
        {
            //전 줄에서 최대값과 현재줄의 값을 더해줌
            //예시에서는 첫째줄 최대값 5와 
            land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3])); //5+5 =10
            land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3])); //5+6=11
            land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));//5+7=12
            land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2])); //5+8=13
        }
        
        for(int i=0;i<land.length;i++)
            Arrays.sort(land[i]); //정렬 후

        answer = land[land.length-1][3]; //마지막 줄에 제일 끝 값이 최대값
        return answer;
    }
}