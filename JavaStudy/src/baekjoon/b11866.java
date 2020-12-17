package baekjoon;
//백준 11866번 요세푸스 문제0
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class b11866
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1])-1;
		//인덱스는 하나 작으니깐 
		int idx = K;
		LinkedList<Integer> qu = new LinkedList<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=1;i<=N;i++)
			qu.add(i);
		
		sb.append("<");
		
		while(qu.size()!=1)
		{	
			//자료구조 Queue<Integer> 일 때는 index가 int 형이여서 부를 수 없음.
			sb.append(qu.get(idx).toString() + ", "); //문제에서는 쉼표 뒤 띄어쓰기 주의
			qu.remove(idx);
			idx = ( idx + K ) % qu.size();
		}
		
		sb.append(qu.pop().toString() + ">");
		
		System.out.println(sb);
	}
}
