package level1;
/*
  문자열 내림차순 만들기
  
  문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
  s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */

public class S007
{
	public static String main(String s)
	{
		 String answer = "";
	        int [] arr = new int[s.length()];
	        for(int i=0;i<arr.length;i++)
	        {
	            char num = s.charAt(i);
	            int newNum = (int)num;
	            arr[i] = newNum;
	        }
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length-i-1;j++)
	            {
	                if(arr[i]<arr[i+1])
	                {
	                    int temp = arr[i];
	                    arr[i] = arr[i+1];
	                    arr[i+1] = temp;
	                    
	                }
	            }
	        }
	     System.out.println(arr[1]);
	        char[] word = new char[arr.length];
	        for(int i=0;i<arr.length;i++)
	        {
	            word[i] = (char)arr[i];   
	            answer += word[i];
	        }
	        
	        
	        return answer;
	}

}
// --==>>실행한 결괏값 'bcdefgZ'이(가) 기댓값 'gfedcbZ'와(과) 다릅니다. 값 안나옴 

//다른 사람 정답
/*
 import java.util.*;
 
class Solution {
    public String solution(String s) {
    
       Character [] arr = new Character [s.length()];
       
		for(int i=0; i<arr.length; i++) 
        {
			arr[i] = s.charAt(i);
		}
		
		Arrays.sort(arr,Collections.reverseOrder());   ***********잘 보기*************
		
		String answer = "";
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		return answer;

    }
}
*/

/*
 	참고
 	public String reverseStr(String str){
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
    }
 */
