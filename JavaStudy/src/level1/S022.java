package level1;
/*
 	콜라츠 추측
 	
 	예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
    위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 
    단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.


 */
public class S022
{
	public static void main(String[] args)
	{
		Solution_S022 s022 = new Solution_S022();
		
	}
}

class Solution_S022 {
    public int solution(double num) {
        int answer = 0;
  
        while(num!=1)
        {
            if(num%2==0)
                num /= 2;
            else if(num%2!=0)
                num = num * 3 + 1;

            ++answer;
            if(answer==500 && num!=1)
                return -1; 
                
        
                    
            
        }
        return answer;
    }
}

/*
  다른 사람 풀이
  
  class Collatz {
    public int collatz(int num) {
    long n = (long)num;
    for(int i =0; i<500; i++){      
      if(n==1) return i;
      n = (n%2==0) ? n/2 : n*3+1;            
    }
    return -1;
  }
 */
