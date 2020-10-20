import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String word = sc.nextLine();
			String[] s = word.split(" ");
			
			for(String temp : s)
			{
				for(int j=temp.length()-1;j>=0;j--)
				{
					System.out.print(temp.charAt(j));
				}
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
}

 






