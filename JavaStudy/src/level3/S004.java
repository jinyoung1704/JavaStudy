package level3;
// 프로그래머스 하노이의 탑

class Solution {
    static int x;
    static int[][] answer;
    public int[][] solution(int n) {
        int num = (int)Math.pow(2,n)-1; //하노이의 탑 개수(공식)
        
        answer = new int[num][2];
        honoi(n,1,2,3);
        
        return answer;
    }
    
    public static void honoi(int n,int from,int via,int to) //n 출발지 경우지 도착지
    {                             // 출발지   경유지   목적지 자리
        if(n==0)
            return;
        honoi(n-1,from,to,via); //n-1개를 경유지로 옮김 (목적지가 경유지이므로 목적지 자리에 via가 감)
        answer[x][0] = from; //출발지에 있는거를
        answer[x++][1] = to; //경유지로 옮기고 x는 +1된 상태
        honoi(n-1,via,from,to); //경유지에서 목적지로 이동 (출발지가 경유지이므로 출발지 자리에 via)
    }
}