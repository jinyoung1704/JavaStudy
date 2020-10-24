import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
	
	 public static void main(String[] args) throws NumberFormatException, IOException
	   {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      String word = br.readLine();
	      
	      System.out.println(word.substring(1,3));
	      Stack<Character> s = new Stack<Character>();
	      s.add('r');
	      int index = word.indexOf("(");
	      System.out.println(index);
	   }
}

 






