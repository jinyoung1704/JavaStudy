package level2;
//프로그래머스 소수만들기

import java.util.*;

class S002 {
    static ArrayList<Integer> list;
    
    public int solution(int[] nums) {
        int answer = 0;
        list = new ArrayList<>();
        
        search(nums);
        
        for(int i=0;i<list.size();i++)
        {
            boolean flag = true;
            int su = list.get(i);
           
            for(int j=2;j<su;j++)
            {
                if(su%j==0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                answer++;
        }

        return answer;
    }
    
    public static void search(int[] nums)
    {
        int sum = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    sum = nums[i] + nums[j] + nums[k];

                    list.add(sum);
                    
                    
                }
            }
        }
        return;
    }
}