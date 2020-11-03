package level2;
//프로그래머스 다리를 지나는 트럭
import java.util.*;

public class S005
{
	public static void main(String[] args)
	{
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		Solution_s005 sol = new Solution_s005();
		System.out.println(sol.solution(bridge_length, weight, truck_weights));
	}
}

class Solution_s005 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸린 시간
        int sum = 0; // 다리위에 있는 트럭의 총 무게
        Queue<Integer> qu = new LinkedList<Integer>();
        
        for(int t : truck_weights)
        {
            while(true)
            {
                if(qu.isEmpty())// 1.다리가 비어있는 경우(트럭 진입 가능)
                {
                    qu.add(t); //트럭 qu에 들어감
                    sum += t; //총무게에 트럭무게 더해짐
                    answer++;//시간 흐름
                    break; //※ break없으면 시간초과 걸림
                }
                else if(qu.size()==bridge_length) 
                { // 2.다리무게와 트럭 수가 같음(새 트럭 진입 못함)
                    //앞에 진입한 트럭은 다리 끝에 다 왔으므로 빼줌
                    sum -= qu.poll();        
                }
                else
                { //3.다리 위에 최대 트럭 수보다 적게 있는 경우
                    if( sum + t >weight)
                    { //새 트럭 진입 불가
                        qu.add(0);
                        answer++;
                    }
                    else
                    {
                        qu.add(t);
                        answer++;
                        sum += t;
                        break;
                    }
                    
                }
            }
        }
        
        
        return answer + bridge_length;
    }
}