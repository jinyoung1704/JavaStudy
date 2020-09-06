package level1;
/*
  	행렬의 덧셈
  	
  	 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
  	 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */

public class S004
{
	public static int[][] main(int[][] arr1, int[][] arr2)
	{
		
		    
 		int[][] answer = new int[arr1.length][arr1[0].length];
       
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0; j<arr1[0].length;j++)
            {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
     

	}

}

/* 다른사람 풀이
 class SumMatrix {
 
    int[][] sumMatrix(int[][] A, int[][] B) {
    int row = Math.max(A.length, B.length);
    int col = Math.max(A[0].length, B[0].length);
        //int[][] answer = {{0, 0}, {0, 0}};
    int[][] answer = new int[row][col];
    for(int i=0; i<row ; i++){
      for(int j=0; j<col; j++){
        answer[i][j] = A[i][j] + B[i][j];
      }
    }

        return answer;
    }
 */
 
