package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b009
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[][] s = new String[n][2];
		for(int i=0;i<n;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
			
		}
		
		Arrays.sort(s, new Comparator<String[]>()
		{

			@Override
			public int compare(String[] o1, String[] o2)
			{
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				//양수이면 두개 자리 바꿈 => 양수라는 것은 앞에 나이가 더 크다는 것
			}
			
		});
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length;i++)
			sb.append(s[i][0]).append(" ").append(s[i][1]).append("\n");
		
		System.out.println(sb);
	}
}

//다른 풀이
class Main_b009 {
	public static void main(String[] args) {		
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        
		Person[] p = new Person[N];
		
 
		for(int i = 0; i < N; i++) {
			p[i] = new Person(in.nextInt(), in.next());
		}
 
		
		// 타입을 Person 으로 둘 것.
		Arrays.sort(p, new Comparator<Person>() {
			// 나이순으로 정렬
			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
			
		});
 
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
			sb.append(p[i]);
		}
        
		System.out.println(sb);
		
	}
    
	public static class Person {
		int age;
		String name;
        
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
        
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}
 
}