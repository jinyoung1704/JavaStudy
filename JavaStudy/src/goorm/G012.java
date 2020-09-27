package goorm;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
//Binary Search
public class G012
{

}

class Main_g012 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<arr.length;i++)
				arr[i] = sc.next();
		Arrays.sort(arr);
		//System.out.println(arr[2]);
		//System.out.println("search?");
		String search = sc.next();
		boolean check=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(search))
			{
				System.out.println(i);
				check = true;
				return;
			}
			
		}
		if(check==false)
			System.out.println("X");
	}
	
}