package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1259번 팰린드롬수

public class b035
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int n;
	      
	      StringBuffer sb = new StringBuffer();
	      do
	      {
	         n = Integer.parseInt(br.readLine());
	         
	         String str = Integer.toString(n);
	         
	         String rStr="";
	         for(int i=str.length()-1;i>=0;i--)
	         {
	            rStr += str.charAt(i);
	         }
	         //System.out.println(str);
	         //System.out.println(rStr);
	         
	         if(n!=0)
	         {
	        	 if(str.equals(rStr)) // ※ String 은 객체로 equals 써야 함!
	 	            sb.append("yes");
	 	         else
	 	            sb.append("no");
	 	         
	 	         sb.append("\n");
	         }
	         
	         
	      } while (n!=0);
	      
	      
	      System.out.println(sb.toString());
	}
}
