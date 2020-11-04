package level3;
import java.util.*;
//프로그래머스 단속카메라(그리디 알고리즘)

public class S002
{
	public static void main(String[] args)
	{
		int[][] routes = {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		Solution_S002 s002 = new Solution_S002();
		System.out.println(s002.solution(routes));
	}
}


class Solution_S002 {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1],b[1])); //먼저 나간 차량을 우선적으로 알기 위해서!
        /*
        for(int i=0;i<routes.length;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(routes[i][j] + " ");
        	}
        	System.out.print("   ");
        }
        
       */
        //람다식 표현법
        //고속도로를 나간 것을 기준으로 정렬(routes[i][1])
        //-18 -13    -14 -5    -5 -3    -20 15 
        
        int camera = -30001; //카메라의 위치
        for(int[] route : routes)
        {
      
            if(route[0]>camera) 
            {
                camera = route[1]; 
                answer++;
            }
        }
                    
        return answer;
    }
}