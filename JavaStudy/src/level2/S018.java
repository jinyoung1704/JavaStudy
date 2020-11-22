package level2;
//프로그래머스 Summer/Winter Coding(~2018) 스킬트리
public class S018
{
	public static void main(String[] args)
	{
		Solution_S018 sol = new Solution_S018();
		String skill = "CBD";
		String[] skill_trees = {"BACDE","CBADF","AECB","BDA"};
		System.out.println(sol.solution(skill, skill_trees));
	}
}

class Solution_S018 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] sk = skill.toCharArray(); // 'C','B','D'
        int[] index = new int[sk.length]; // 해당 문자가 문자열에서 몇번째 인덱스에 있는지
        
        for(int i=0;i<skill_trees.length;i++)
        {
            for(int j=0;j<sk.length;j++)
            {
                index[j] = skill_trees[i].indexOf(sk[j]);
                if(index[j]==-1) //-1이면 문자열에 해당문자가 없는것! 
                    index[j] = 27; //스킬트리 원소길이가 최대 26
                
                //다른 있는 인덱스보다 큰 숫자로 바꿔놓음
                //-1이 있어도 되는 경우 :
                //1) 맨마지막 스킬 순서, 2)아예 다 상관없는 스킬
                //System.out.print(index[j]);
            }
            
            boolean flag = true;
            for(int k=0; k<index.length-1;k++)
            {
                if(index[k]>index[k+1])
                {//선행 스킬이 안 이뤄진 상태
                    flag = false;
                    break;
                }
                
            }
            //System.out.println(flag);
            if(flag)
                answer++;
        }
        return answer;
    }
}