package Day4;

import java.util.Scanner;

public class Arrectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter length");
		int length=sc.nextInt();
		
		System.out.println("Enter breadth");
		int breadth = sc.nextInt();
		
		int area = length*breadth;
		System.out.println("area of Rectangle :"+area);
	

	}

}
