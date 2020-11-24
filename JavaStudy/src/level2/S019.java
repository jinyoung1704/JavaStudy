package level2;
import java.util.*;
//다리를 지나는 트럭 복습1
public class S019
{
	public static void main(String[] args)
	{
		
	}
}


class Solution_S019 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> qu = new LinkedList<>();
        int sum = 0;
       for(int t : truck_weights)
        {
           while(true)
           {
               if(qu.isEmpty())
               {
                   qu.add(t);
                   sum += t;
                   answer++;
                   break; //check~!
               }
               else if(qu.size() ==bridge_length)
               {
                   sum -= qu.poll();
               }
               else
               {
                   if(t+sum<=weight)
                   {
                       qu.add(t);
                       sum += t;
                       answer++;
                        break;
                   }
                   else
                   {
                       qu.add(0); //check~!
                       answer++;
                   }
                       
                    
               }
           }
           
        }
        
        return answer + bridge_length; //check~!
    }
}