package level2;
//프로그래머스 가장 큰 정사각형 찾기

public class S017
{
	public static void main(String[] args)
	{
		Solution_S017 sol = new Solution_S017();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}	;
		System.out.println(sol.solution(board));
	}
}

class Solution_S017
{//dp문제
    public int solution(int [][]board)
    {
        int answer = 1234;
        int up,left,leftup; //위,왼쪽,왼쪽위
        for(int y=1;y<board.length;y++)
        {
            for(int x=1;x<board[y].length;x++)
            {
                if(board[y][x]==1)
                {
                    up = board[y-1][x];
                    left = board[y][x-1];
                    leftup = board[y-1][x-1];
                    
                    int min = Math.min(Math.min(up,left),leftup);
                    board[y][x] = min + 1;
                }
 
            }
        }
        
        int len=0;
        for(int y=0;y<board.length;y++)
        {
            for(int x=0;x<board[y].length;x++)
            {
                if(board[y][x]>0)
                {
                    len = Math.max(board[y][x],len);
                }
            } 
        }
        answer = len * len;
        return answer;
    }
}