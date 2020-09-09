package level1;
/*
 	문자열 내 마음대로 정렬하기 
 	
 	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 	예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
 
*/

import java.util.Arrays;

public class S009
{
	public static String[] main(String[] strings, int n)
	{
		 String[] answer = new String[strings.length];
	        char[] arr = new char[strings.length];
	        for(int i=0;i<strings.length;i++)
	            arr[i] = strings[i].charAt(n);
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length-1-i;j++)
	            {
	                if(arr[j]>arr[j+1])
	                {
	                    char temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                    
	                    System.out.println(arr[0]);
	                    System.out.println(arr[1]);
	                    System.out.println(arr[2]);
	                    
	                    String word = strings[j];
	                    strings[j] = strings[j+1];
	                    strings[j+1] = word;
	                }
	                else if(arr[j]==arr[j+1])
	                    Arrays.sort(strings);
	                
	            }
	        }
	        
	        for(int i=0;i<strings.length;i++)
	            answer[i] = strings[i];
	            
	        
	        
	        
	        return answer;
	}

}

//--==>> 테스트 하나만 됨

/*	다른 사람 풀이
 	
 	  String[] answer = new String[strings.length];
        
        ArrayList<String> arr = new ArrayList<String>();
        
        for(int i=0;i<strings.length;i++)
            arr.add(strings[i].charAt(n) + strings[i]);
        
        Collections.sort(arr);
        
        for(int i=0;i<arr.size();i++)
            answer[i] = arr.get(i).substring(1);
        
        return answer;
 
 */ 

/*
 	Arrays.sort(strings, new Comparator<String>(){
      @Override
      public int compare(String s1, String s2){
          if(s1.charAt(n) > s2.charAt(n)) return 1;
          else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
          else if(s1.charAt(n) < s2.charAt(n)) return -1;
          else return 0;
      }
 */
