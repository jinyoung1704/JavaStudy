package level3;
//프로그래머스 가장 긴 팰린드롬
public class S005
{

}

class Solution_s005
{
    public int solution(String s)
    {
        int answer = 1;
        int slength = s.length();
        int[][] dp = new int[slength][slength];
        char[] cha = s.toCharArray();
        
        //1자리
        for(int i=0;i<s.length();i++)
        {
            dp[i][i] = 1;
        }
        
        //2자리
        for(int i=0;i<s.length()-1;i++)
        {
            if(cha[i]==cha[i+1])
            {
                dp[i][i+1] = 1;
                answer = 2;
            }
        }
        
        //3자리
        for(int k=3;k<=s.length();k++)
        {
            for(int i=0;i<=s.length()-k;i++)
            {
                int j = k+i-1; //k+i==>전체길이 
                if(cha[i]==cha[j] && dp[i+1][j-1]==1) //i와 j 문자열이 같고 그 전 글자들이 팰린드롬이었을 때(★왜 i+1,j-1 이지?)
                {
                    dp[i][j] = 1;
                    answer = Math.max(answer,k);
                }
            }
        }
        
        return answer;
    }
}