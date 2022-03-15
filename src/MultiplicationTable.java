import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		int i;
		System.out.println();
		for(i=0;i<12;i++)
		{
			System.out.println(num*(i+1));
		}
	}

}
