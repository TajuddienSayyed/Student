package Excercise2;
import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		double n= s.nextDouble();
		double p= Math.pow(n, 0.5);
		int r= (int)Math.round(p);
		if(r*r==n)
			System.out.print("Perfect Square");
		else
			System.out.print("Not a Perfect Square");
			
		// TODO Auto-generated method stub

	}

}
