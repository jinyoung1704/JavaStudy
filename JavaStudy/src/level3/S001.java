package level3;
//프로그래머스 섬 연결하기
public class S001
{
	public static void main(String[] args)
	{
		int n = 4;
		int costs[][] = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };
		
		Solution so = new Solution();
		System.out.println(so.solution(n, costs));
	}
	
	public static class Solution {
	    public int solution(int n, int[][] costs) {
            int answer = 0;
	        boolean[] visited = new boolean[n]; //방문을 확인하기 위한
	        int[][] nodeCost = new int[n][n]; //노드간의 비용
	        
	        for(int i=0;i<costs.length;i++)
	        {
	            nodeCost[costs[i][0]][costs[i][1]] = costs[i][2]; //0과 1이 연결되어 있으면
	            nodeCost[costs[i][1]][costs[i][0]] = costs[i][2]; //1과 0에도 같은 비용을 넣어줌
	        }
	        
	        visited[0] = true; //처음 노드 0부터 시작하므로
	        answer = prim(nodeCost,visited,0,1);
	        
	        return answer;
	    }
	    
	    public static int prim(int[][] nodeCost,boolean[] visited,int answer,int count)
	    {
	        if(count==visited.length) //n개의 노드 다 방문한 경우 
	            return answer;
	        int minCost =  Integer.MAX_VALUE; //정수의 최대값으로 설정
	        int minNode = -1; //노드는 0부터 다른 수들이 들어갈 것이므로 상관없는 -1을 초기값으로 해둠
	        
	        for(int i=0;i<visited.length;i++)
	        {
	            if(visited[i]) //처음에는 0이 출발점 
	            {
	                for(int j=0;j<nodeCost.length;j++)
	                {
	                    if(!visited[j] && nodeCost[i][j]!=0 && minCost > nodeCost[i][j] )                   
	                    { //0과 이어진 곳을 아직 방문하지 않았고 두 점이 이어져 있고 비용이 int의 최대값보다 작으면
	                        minNode = j; //이어진 노드로 다시 설정
	                        minCost = nodeCost[i][j]; //최소비용 다시 설정
	                    }
	                    
	                    
	                }
	            }
	        }
	        visited[minNode] = true; 
            answer += minCost;
            count++;
	        return prim(nodeCost,visited,answer,count);
	    }
}

}

