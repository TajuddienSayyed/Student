package Excercise2;
import java.util.Scanner;
import java.lang.Math;
public class Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		double n= s.nextDouble();
		double p= Math.pow(n, 0.5);
		int r= (int)Math.round(p);
		System.out.print(r);
		// TODO Auto-generated method stub

	}

}
