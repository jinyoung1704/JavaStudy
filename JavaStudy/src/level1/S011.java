package level1;
/*
 	 약수의 합
 	 
 	 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */

class S011
{
	public static void main(String[] args)
	{
		Solution_S011 solution = new Solution_S011();
		System.out.println(solution.solution(10));
		
	}
	
	
	
}

class Solution_S011 {
    public int solution(int n) {
        int answer = 0;
       
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                answer += i;
        }
        
        return answer;
    }
}

/*
  다른 사람 풀이
	
	class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){ //약수는 주어진 수의 절반을 넘어가는 수는 없으므로 절반까지만 
        if(num%i == 0) answer += i;			 //반복을 돌리는 것이 효율성이 더 높음
      }
        return answer+num; //자기 자신 더해줌
    }
*/
