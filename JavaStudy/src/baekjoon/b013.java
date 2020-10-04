package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b013
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String[] su = br.readLine().split(" ");
		
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(su[i]);
		
		Arrays.sort(arr); // binarySearch 를 쓰려면 반드시 정렬이 된 상태에서 써야 원하는 값을 얻을 수 있음
		
		int count = Integer.parseInt(br.readLine());
		int[] newArr = new int[count];
		
		String[] su2 = br.readLine().split(" ");
		
		for(int i=0;i<newArr.length;i++)
		{
			newArr[i] = Integer.parseInt(su2[i]);
			
			int index = Arrays.binarySearch(arr, newArr[i]); // 값이 해당하는 인덱스 위치 반환
			
			if(index>=0) //index는 0부터 시작이므로 0도 포함해줘야 한다.
				System.out.println("1"); 
			else //값이 없으면 음수 반환
				System.out.println("0");
		}
	}
}


/*
	HashSet<Integer> hs = new HashSet<Integer>(); 
	for(int i=0; i<N; i++) { 
		hs.add(sc.nextInt()); // N의 정수 A(HasSet)에 담기 
	}
	 
	M = sc.nextInt(); 
	
	int arr[] = new int[M]; 
	
	for(int i=0; i<M; i++) { 
		arr[i] = sc.nextInt(); 
	
	} 
	
	for(int i=0; i<M; i++) { 
	
	if (hs.contains(arr[i])) 
	{
	 // M개의 수들이 A에 존재하는지 체크 
	  answer = 1; 
	 
	} else {
	 answer = 0; 
	 } 
	
	System.out.println(answer);


*/