package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//좌표 정렬하기

public class b005
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i=0;i<arr.length;i++)
		{
			String[] s = (br.readLine()).split(" ");
			
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
			
		}
		
		Arrays.sort(arr, new Comparator<int[]>()
		{

			@Override
			public int compare(int[] o1, int[] o2)
			{
				if(o1[0]==o2[0]) //x좌표가 같을 경우에는
					return Integer.compare(o1[1], o2[1]); // y좌표로 정렬
				
				return Integer.compare(o1[0], o2[0]); //아닌 경우에는 x좌표로 정렬
			}
		});
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}

}
