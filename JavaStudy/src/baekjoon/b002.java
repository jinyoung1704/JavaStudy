package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class b002
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<n;i++)
		{
			String word = br.readLine();
			
			if(!list.contains(word))
				list.add(word);
			
		}
		
		Collections.sort(list, new Comparator<String>()
		{

			@Override
			public int compare(String a,String b)
			{
				if(a.length()>b.length())
					return 1; //a에 대해서 오름차순 ==> 두 개 자리 변경
				else if(a.length()<b.length()) 
					return -1;  //그대로 유지
				else
					return a.compareTo(b); // 두 개의 문자를 비교하여 값이 동일하면 0, 왼쪽이 더 크면 1,반대는 -1
			}

		});
	
		for(String s : list)
			System.out.println(s);
		
		
	}
}

/*
 compare() 메서드 작성법
 
첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴

음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 변경된다.

즉, Integer.compare(x, y)(오름차순 정렬)와 동일한 개념이다.

return (x < y) ? -1 : ((x == y) ? 0 : 1);
내림차순 정렬의 경우 두 파라미터의 위치를 바꿔준다.

Integer.compare(y, x)(내림차순 정렬)
 */
