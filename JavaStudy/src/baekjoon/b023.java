package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b023
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++) //문장
		{
			String str = br.readLine();
			
			int sum = 0;
			char[] cha = str.toCharArray();
			
			
			for(int j=0;j<cha.length;j++) //한 단어씩 끊어서 비교
			{
				if(cha[j]=='O') //O이면 1점 적립 후
				{
					sum++;
					
					for(int k=j-1;k>=0;k--) //바로전꺼부터 연달아 O가 있는지 확인
					{
						if(cha[k]=='O')
							sum++;
						else
							break;
						
					}
					
					
				}
				
				
			}
			
			System.out.println(sum);
			
			
		}
		
	}
}

//비교
/*
 	import java.util.Scanner;

	public class Main
	{
	   public static void main(String[] args)
	   {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      String [] str = new String [n];
	      for(int i=0; i<n; i++)
	      {
	         str[i] = sc.next();
	      }
	      
	      StringBuffer sb = new StringBuffer();
	      
	      for(int i=0; i<n; i++)
	      {
	         int len = str[i].length();
	         int temp = 0;
	         int count =0;
	         for(int j=0; j<len; j++) {
	            
	            if(str[i].charAt(j)=='O')
	            {
	               count++;
	               temp+=count;
	            }
	            else if(str[i].charAt(j)=='X')
	            {
	               count=0;
	            }
	            
	         }
	         sb.append(temp+"\n");
	      }
	      
	      System.out.println(sb.toString());
	      
	   }
	   
	}
 */
