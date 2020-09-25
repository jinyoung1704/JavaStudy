package goorm;
import java.io.*;
//시험성적 평균과 등급 구하기
public class G006
{

}

class Main_g006 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] score = input.split(" ");
		int sum =0;
		for(int i=0;i<score.length;i++)
			sum += Integer.parseInt(score[i]);
		//System.out.println(sum);
		double avg = sum/3.0;
		String result ="";
		if(avg>=90)
			result = "A";
		else if(avg>=80)
			result = "B";
		else if(avg>=70)
			result = "C";
		else if(avg>=60)
			result = "D";
		else
			result = "F";
	
	
		System.out.println(String.format("%.2f",avg ) + " " + result);
	}
}