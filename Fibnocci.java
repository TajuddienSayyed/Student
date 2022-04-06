package Excercise2;
import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the range :");
		int n= s.nextInt();
		int a=0;
		int b=1;
		int f=a+b;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			System.out.print(f+" ");
			a=b;
			b=f;
			f=a+b;
			
		}
		// TODO Auto-generated method stub

	}

}
