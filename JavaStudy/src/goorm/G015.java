package goorm;
//배열 합치기
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;;


public class G015
{

}

class Main_g015 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		int[] temp1 = new int[a];
		int[] temp2 = new int[b];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		String[] word1 = br.readLine().split(" ");
		String[] word2 = br.readLine().split(" ");
		
		for(int i=0;i<temp1.length;i++)
		{
			temp1[i] = Integer.parseInt(word1[i]);
			list.add(temp1[i]);
		}
		for(int i=0;i<temp2.length;i++)
		{
			temp2[i] = Integer.parseInt(word2[i]);
			list.add(temp2[i]);		
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i).intValue()+" ");
		
	}
}