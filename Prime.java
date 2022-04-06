package Excercise2;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n= s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i!=0) {
				System.out.println("Prime");
				break;
			}
			else
			{
				System.out.println("Non Prime Number");
				break;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
