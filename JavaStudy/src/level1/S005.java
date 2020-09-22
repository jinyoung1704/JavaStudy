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
		
		  boolean flag; for(int i=2;i<=n;i++) 
		  {
			  flag = true; 
			  for(int j=2;j<=i/2;j++) 
			  {
				  if(i%j==0) 
				  { 
					  flag = false; break; 
				  } 
			  }
		  
			  if(flag == true) 
				  answer++;
		  
		  }
		 
		 
		 
	      return answer;
	      
	}
}

//이렇게 하니깐 시간 제한 걸림

//다른 사람 풀이법(에라토스테네스의 체)
// 주어진 수까지 나열한 뒤 2는 소수이므로 옆으로 제외, 주어진 수에 대해 2의 배수인 것 모두 제거
// 3은 소수니깐 옆으로 제외, 3의 배수 모두 제거
// 5,7 ... 마찬가지 방법으로 계산하여 소수만 구한다.

/*
 	class Solution {
  public int solution(int n) {
		int answer = 0;
		
		boolean[] checked = new boolean[n + 1]; //boolean 기본값 false로 설정됨
		
 		//2는 소수
		for (int i = 2; i <= n; i++) 
		{
		
			if (!checked[i]) //checked[i]가 false 인것 => 2 속해있음 => answer 올라감
				answer++;
				
			for (int j = i; j <= n; j += i)
			{ //2의 배수 다 제거 => true 로 만들어서 반복문이 끝났고 위의 반복문으로 갔을 때
				if (!checked[j])  			  //카운트 안되도록!
					checked[j] = true;
			}
		}      
      return answer;
  }
}
 */









