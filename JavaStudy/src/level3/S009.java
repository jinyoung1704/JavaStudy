package level3;
import java.util.*;

public class S009
{
	public static void main(String[] args)
	{
		
	}
}


class Solution_S009 {
    static int[] visit;
    static ArrayList<String> list;
    static String route = "";
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        visit = new int[tickets.length];
        list = new ArrayList<>();
        
        for(int i=0;i<tickets.length;i++)
        {
            String start = tickets[i][0];
            String des = tickets[i][1];
            
            if(start.equals("ICN"))
            {
                visit[i] = 1;
                route = start + ",";
                dfs(tickets,des,1);
                visit[i] = 0;
            }
        }
        
        Collections.sort(list);
        answer = list.get(0).split(",");
        
        return answer;
    }
    
    public static void dfs(String[][] tickets,String des,int count)
    {
        route += des +",";
        
        if(count==tickets.length)
        {
            list.add(route);
            return;
        }
        
        for(int i=0;i<tickets.length;i++)
        {
            String e = tickets[i][1];
            String s = tickets[i][0];
            if(visit[i]==0 && des.equals(s))
            {
                visit[i]=1;
                dfs(tickets,e,count+1);
                visit[i]=0;
                route = route.substring(0,route.length()-4);
                
            }
        }
        
        
    }
}