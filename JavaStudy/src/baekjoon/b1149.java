package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1149번 RGB거리(동적 프로그래밍 DP 방식)
public class b1149
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		
		for(int i=0;i<arr.length;i++)
		{
			String[] str = br.readLine().split(" ");
			
			for(int j=0;j<3;j++)
			{
				arr[i][0] = Integer.parseInt(str[0]);
				arr[i][1] = Integer.parseInt(str[1]);
				arr[i][2] = Integer.parseInt(str[2]);
			}
		}
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
		}
		
		int answer = arr[arr.length-1][0];
		System.out.println(answer);
	}

}
