package level1;
//프로그래머스 Test1 탐욕법

class Solution_Test2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n; //학생수로 세팅
        int[] people = new int[n]; //기본으로 0으로 세팅

        for(int l : lost)
            people[l-1]--; //체육복이 없는 사람의 인덱스를 -1로 

        for(int r : reserve) //여분이 있는 학생을 +1로 
            people[r-1]++;

        for(int i=0;i<people.length;i++)
        {
            if(people[i]==-1) //현재 체육복이 없는 학생
            {
                if(i-1>0 && people[i-1]==1) // 앞사람이 존재하고 그 앞사람이 여분 체육복을 가지고 있는 경우
                {
                    people[i-1]--;
                    people[i]++;
                }
                else if(i+1<people.length && people[i+1]==1 ) //뒷사람이 있고 그 뒷사람이 체육복을 가지고 있는 경우
                {
                    people[i+1]--;
                    people[i]++;
                }
                else //앞사람도 뒷사람도 다 여분 체육복이 없는 경우 체육복을 못 빌리므로 참석가능 인원(answer)에서 인원감소
                    answer--;
            }
        }

        return answer;
    }
}




