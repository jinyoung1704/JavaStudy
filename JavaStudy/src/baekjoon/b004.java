package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b004
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i=0;i<arr.length;i++)
		{
			String[] temp = (br.readLine()).split(" ");
			arr[i][0] = Integer.parseInt(temp[0]);
			arr[i][1] = Integer.parseInt(temp[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>()
		{

			@Override
			public int compare(int[] a, int[] b)
			{
				if(a[1]==b[1])
					return Integer.compare(a[0], b[0]); // 뒤에 입력된 값이 동일 시 앞에 좌표 값으로 정렬
				
				return Integer.compare(a[1], b[1]) ; // 뒤에 값으로 다시 정렬

			}
		});
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}

}

