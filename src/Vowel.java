import java.util.Scanner;

public class Vowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Alphabet = ");
		String ch = sc.next().toLowerCase();
		
		if(ch.length()>1)
		{
			System.out.println("Please Enter Single Alphabet....!!!");
		}
		else if(ch.charAt(0)=='a' || ch.charAt(0)=='e' || ch.charAt(0)=='i' || ch.charAt(0)=='o' || ch.charAt(0)=='u' || ch.charAt(0)=='A' || ch.charAt(0)=='E' || ch.charAt(0)=='I' || ch.charAt(0)=='O' || ch.charAt(0)=='U')
		{
			System.out.println("Given Character is Vowels");
		}
		else if((ch.charAt(0)>='a' && ch.charAt(0)<='z') || (ch.charAt(0)>='A' && ch.charAt(0)<='Z'))
		{
			System.out.println("Given Character is Consonant");
		}
	}
}
