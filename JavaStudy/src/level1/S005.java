package level1;
/*
 	소수 찾기
 	
 	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 */

public class S005
{
	public static int main(int n)
	{
		 int answer = 0;
	      boolean flag;
	      for(int i=2;i<=n;i++)
	      { 
	          flag = true;
	          for(int j=2;j<=i/2;j++)
	          {
	              if(i%j==0)
	              {
	                  flag = false;
	                  break;
	              }
	          }
	          
	          if(flag == true)
	              answer++;
	          
	      }
	      return answer;
	}
}
