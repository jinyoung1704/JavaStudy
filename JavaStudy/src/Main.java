

public class Main
{
	public static void main(String[] args)
	{
		String word = "Happy";
		System.out.println(word.charAt(0));
		String newWord = word.replace(word.substring(0,word.length()-2), "*");
		System.out.println(newWord);
		
	}
}
