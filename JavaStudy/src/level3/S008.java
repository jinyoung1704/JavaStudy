package level3;

import java.util.Arrays;

public class S008
{

}

class Solution_S008 {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a,b)->Integer.compare(a[1],b[1]));
        
        int camera = -30001;
        for(int i=0;i<routes.length;i++)
        {
            int temp = routes[i][0];
            
            if(temp>camera)
            {
                camera = routes[i][1];
                answer++;
            }
            
        }
        return answer;
    }
}