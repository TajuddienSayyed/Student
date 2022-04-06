package Excercise2;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n= s.nextInt();
		int res=0;
		int k=n;
		while(n!=0)
		{
			int r=n%10;
			res=res+r*r*r;
			n=n/10;
		}
		//s1=Integer.toString(n);
		if(k==res)
			System.out.print("Armstrong");
		else
			System.out.print("Not a Armstrong");
		// TODO Auto-generated method stub

	}

}
