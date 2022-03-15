import java.util.*;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First number = ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second number = ");
		int num2 = sc.nextInt();
		System.out.println("Enter a Third number = ");
		int num3 = sc.nextInt();
		
		if((num1>num2) && (num1>num3))
		{
			System.out.println("\nThe Greatest Number is : "+num1);
		}
		else if((num2>num1) && (num2>num3))
		{
			System.out.println("\nThe Greatest Number is : "+num2);
		}
		else if((num3>num1) && (num3>num2))
		{
			System.out.println("\nThe Greatest Number is : "+num3);
		}

	}

}
