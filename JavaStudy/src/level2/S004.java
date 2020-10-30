package level2;
//프로그래머스 멀쩡한 사각형

class Solution {
    public long solution(int w, int h) {
        
        long result = cal(w,h);
        return result;
        
    }
    
    public static long cal(int w,int h)
    {
        long answer=0;
        
        long max = (long)h;
        long min = (long)w;
        
        if(w<h)
        {
            max = (long)h;
            min = (long)w;
        }
        
        long value=1;
        while(value>0)
        {
            value = max % min;
            max = min;
            min = value;
        }
        
        
        answer =  (long)w * (long)h -((long)w + (long)h -max) ;
        return answer;
    }
}
