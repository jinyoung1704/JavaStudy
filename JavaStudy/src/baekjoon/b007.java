package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//10989 수 정렬하기 3

public class b007 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
			sb.append(arr[i] + "\n");
		
		System.out.println(sb);
	}
	

}
//--==> 메모리 초과...


class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
        
		for(int i=0;i<arr.length;i++)
		    arr[i] = Integer.parseInt(br.readLine());
        
		Arrays.sort(arr);

		for(int i=0;i<n;i++)
			sb.append(arr[i]).append("\n");  //--==>> append를 두번써서 해야 메모리 초과 안됨.
		
		System.out.println(sb);
	}
	

}