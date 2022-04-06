package Excercise2;
import java.util.Scanner;
public class NthPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= s.nextInt();
		int num=1,count=0,i;
		while(count<n)
		{
			num++;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
				count++;
		}
		System.out.print("Nth prime value is "+num);
		
		// TODO Auto-generated method stub

	}

}
