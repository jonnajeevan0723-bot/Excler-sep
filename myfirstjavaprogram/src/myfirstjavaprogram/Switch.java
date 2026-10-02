package myfirstjavaprogram;
import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Telugu");
		System.out.println("2.maths");
		System.out.println("3.Science");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:System.out.println("coming from Andhra Pradesh");  break;
		case 2:System.out.println("coming from USA"); break;
		case 3:System.out.println("Coming from Japan"); break;
		}
		

	}

}
