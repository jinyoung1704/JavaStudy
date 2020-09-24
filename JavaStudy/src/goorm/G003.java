package goorm;
import java.io.*;
import java.util.*;

//약수 구하기
public class G003
{

}

class Main_g003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int su = Integer.parseInt(input);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=su/2;i++)
		{
			if(su%i==0)
				list.add(i);
		}
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + " " );
	
		System.out.print(su +" ");
	}
}