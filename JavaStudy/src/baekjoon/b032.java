package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 10974번 모든 순열
public class b032
{
	static int[] output,visit;
	static int N;
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++)
			arr[i] = i+1;
		
		dfs(0);
		
	}
	
	public static void dfs(int v)
	{
		if(v==N)
		{
			for(int i=0;i<N;i++)
			{
				System.out.println(output[i]);
			}
		}
		
		for(int i=v+1;i<=N;i++)
		{
			if(visit[i]==0)
			{
				visit[i]=1;
				output[v]=i+1;
				dfs(v+1);
				visit[i]=0;
			}
			
		}
	}
}


/*
public class Baekjoon_10974 {

public static int cnt = 0;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // n까지의 정수 배열
    int[] input = new int[n];
    // input 배열에서 값을 추출하여 저장할 배열
    int[] array = new int[n];
    // index 접근 유무 확인 용도
    boolean[] access = new boolean[n];

    // n까지의 정수배열 값 셋팅
    for (int i = 0; i < n; i++) {
        input[i] = i+1;
    }

    // 메서드 실행
    check(input, array, access, 0, n);

}

public static void check(int[] input, int[] array, boolean[] access, int dep, int n) {

    // n개의 개수와 깊이를 비교하여 로직 수행여부 결정
    if(n > dep) {
        for (int i = 0; i < n; i++) {
            cnt++;
//            System.out.println("cnt = [" + cnt + "] " + "input = [" + input[i] + "], array = [" + array[i] + "], access = [" + access[i] + "], dep = [" + (dep+1) + "], n = [" + n + "]");
            // index 접근하여 추출한 여부 체크
            if(!access[i]) {
                // dep 번째 index에 i 번째 값을 넣는 부분이 중요
                array[dep] = input[i];
                access[i] = true;
                check(input, array, access, dep+1, n);
                // 접근한 index를 다시 false로 초기화 시켜주어야 다음 경우의 순열이 접근가능
                access[i] = false;
            }
        }
    } else {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
}
*/