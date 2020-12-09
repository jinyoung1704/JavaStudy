package baekjoon;
//백준 10952번 A+B-5
import java.util.ArrayList;
import java.util.Scanner;

public class b10952
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a,b = 0;
		do
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			list.add(a+b);
			
		} while (a!=0 && b!=0);
		
		for(int i=0;i<list.size()-1;i++)
			System.out.println(list.get(i));
	}
}
