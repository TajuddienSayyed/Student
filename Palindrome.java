package Excercise2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n= s.nextInt();
		String s1="";
		int res=0;
		int k=n;
		while(n!=0)
		{
			int r=n%10;
			res=res*10+r;
			n=n/10;
		}
		//s1=Integer.toString(n);
		if(k==res)
			System.out.print("palindrome");
		else
			System.out.print("Not a Palindrome");
		// TODO Auto-generated method stub

	}

}
