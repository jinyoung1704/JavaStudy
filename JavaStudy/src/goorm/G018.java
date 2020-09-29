package goorm;
//구름 계산기
import java.io.*;

class Main_g018 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[2]);
		String su = arr[1];
		
		switch(su){
		
		
			case "+" : System.out.println(a+b);
								break;
								
			case "-" : System.out.println(a-b);
								break;
								
			case "*" : System.out.println(a*b);
								break;
								
			case "/" : double d = a/(double)b;
						System.out.printf("%.2f",d);
								break;
		}
		
	}
}