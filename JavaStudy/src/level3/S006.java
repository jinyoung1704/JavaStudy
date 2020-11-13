package level3;
//프로그래머스 단어변환

public class S006
{
	public static void main(String[] args)
	{
		Solution_S006 sol = new Solution_S006();
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		System.out.println(sol.solution(begin, target, words));
	}
}

class Solution_S006 {
    static int minCnt = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        dfs(new boolean[words.length],0,begin,target,words);
        
        // 해당 단어가 배열에 없는단어면..
        if(minCnt==Integer.MAX_VALUE)
            minCnt = 0;
        
        answer = minCnt;
        return answer;
    }
    public static void dfs(boolean[] visited,int count,String begin,String target,String[] words)
    {
        
        //타겟이랑 일치하면
        if(begin.equals(target))
        {
            if(minCnt>count)
                minCnt = count;
        }
    
        for(int i=0;i<words.length;i++)
        {
            //방문하지 않고 한글자만 바꿨다면
            if(!visited[i] && checkCount(begin,words[i]))
            {
                visited[i] = true;
                dfs(visited,count+1,words[i],target,words);
                visited[i] = false;
            }
        }
    
    }
    //한글자만 바꿨는지 확인하기 위해
    public static boolean checkCount(String begin,String target)
    {
        char[] cha1 = begin.toCharArray();
        char[] cha2 = target.toCharArray();
        
        int count = 0;
        for(int i=0;i<cha1.length;i++)
        {
            if(cha1[i] != cha2[i])
                count++;
        }
        
        if(count==1)
            return true;
        
        return false;
      
            
    }
}