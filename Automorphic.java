package Excercise2;
import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= s.nextInt();
		int sq=n*n;
		int rem=sq%10;
		if(rem==n)
			System.out.print("Automorphic");
		else
			System.out.print("Not a Automorphic");
		// TODO Auto-generated method stub

	}

}
