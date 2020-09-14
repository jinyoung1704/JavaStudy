package level1;
/*
 	정수 제곱근 판별
 	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
 	n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */

public class S021
{
	public static void main(String[] args)
	{
		Solution_S021 s021 = new Solution_S021();
		System.out.println(s021.solution(121));
	}
	
}


class Solution_S021 {
    public long solution(long n) {
        long answer= -1;
        if(Math.pow((int)Math.sqrt(n),2)==n)
            answer =  (long)Math.pow(Math.sqrt(n)+1,2);
        return answer;
    }
}

//Math.pow(double a, double b) => a의 b제곱
//Math.sqrt(double a) => a의 제곱근 