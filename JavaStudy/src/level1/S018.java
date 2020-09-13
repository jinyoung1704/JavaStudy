package level1;
/*
 	최대공약수와 최소공배수
 	
 	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */

public class S018
{
	public static void main(String[] args)
	{
		Solution_S018 s018 = new Solution_S018();
		System.out.println(s018.solution(6, 12));
		
	}
}

class Solution_S018 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigVal;
        
        if(n>m)
        	bigVal = n;
        else
        	bigVal = m;
        
        while(bigVal>1)
        {
        	if(n%bigVal==0 && m%bigVal==0)
        	{
        		answer[0] = bigVal; //최대공약수
        		answer[1] = n*m/bigVal; //최소공배수
        		break;
        	}
        	
        	bigVal -= 1;
        }
        
        if(answer[0]==0)
        {
        	answer[0] = 1;
        	answer[1] = n*m;
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}

