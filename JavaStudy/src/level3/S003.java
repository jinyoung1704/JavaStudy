package level3;
//프로그래머스 여행경로
import java.util.*;

public class S003
{
	public static void main(String[] args)
	{
		
	}
}

class Solution_s003 {
    static int[] visited;
    static String route="";
    static ArrayList<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        
        visited = new int[tickets.length];
        
        for(int i=0;i<tickets.length;i++)
        {
            String start = tickets[i][0]; //출발지
            String end = tickets[i][1]; //목적지
            
            if(start.equals("ICN"))
            {
                visited[i] = 1;
                route = start + ",";
                dfs(tickets,end,1);
                visited[i] = 0;
            }
        }
        Collections.sort(list);
        //for(int i=0;i<list.size();i++)
        //    System.out.println(list.get(i));
        
        answer = list.get(0).split(",");
        
        return answer;
    }
    
    public static void dfs(String[][] tickets,String end,int count)
    {
        route += end + ",";
     //System.out.println(count);
        if(count==tickets.length)
        {
            list.add(route);
            return;
        }   
        
        for(int i=0;i<tickets.length;i++)
        {
            String dep = tickets[i][0]; //출발지
            String des = tickets[i][1]; //목적지
            
            if(end.equals(dep) && visited[i]==0)  //직전에 목적지가 이번에 출발지와 같으면
            { 
                visited[i] = 1;
                dfs(tickets,des,count+1);
                visited[i] = 0;
                
                route = route.substring(0,route.length()-4); //이게 없으면 메모리 초과 나옴
                //반복적인거를 삭제해줌(★)
                //System.out.println(route);
        
            }
        }
    }
    
}