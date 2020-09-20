package level1;
//완주하지 못한 선수

/*
 	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
 	단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

 */
import java.util.*;
class S027
{
	public static void main(String[] args)
	{
		Solution_S027 s027 = new Solution_S027();
	}
}
//participant : ["leo", "kiki", "eden"]
//completion : ["eden", "kiki"]

class Solution_S027 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0; // i를 밖으로 선언해야지만 통과 됨 => 정렬 후 둘이 순서가 같고 맨 마지막에 완주하지 못한 선수가
        for(i=0;i<completion.length;i++) //있는 경우 반복문 안에 있으면 더 이상 루프가 돌지 않지만
        {								//밖에 선언해주면 마지막 i(예를 들어 2)를 가지고 반복문 나옴
            if(!participant[i].equals(completion[i]))
            {
               return participant[i];  
              
            }
        }
         return participant[i];
    }
}

/*
 class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
*/
 

