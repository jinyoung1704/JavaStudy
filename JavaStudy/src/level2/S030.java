package level2;
import java.util.HashMap;
import java.util.Iterator;
//프로그래머스 위장
public class S030
{
	public static void main(String[] args)
	{
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		Solution_S030 sol30 = new Solution_S030();
		System.out.println(sol30.solution(clothes));
	}
}

class Solution_S030 {
    public int solution(String[][] clothes) {
    	
    	
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++)
        {
            String key = clothes[i][1];
            //System.out.println(key);
            if(!map.containsKey(key))
                map.put(key,1);
            else
                map.put(key,map.get(key)+1);
            
        }
        
        Iterator<Integer> it = map.values().iterator();
        
        while(it.hasNext()) //hasNext 다음 값은 가지고 있는지 true/false 반환
        {
            answer *= it.next().intValue() + 1; //착용을 안하는 경우 +1
        }
        return answer-1; //모두다 착용을 안하는 경우 하나 빼줌
        //위에서 모자 모두 착용안하는 경우,안경 모두 착용 안하는 경우 이렇게 계산했으므로
    }
}