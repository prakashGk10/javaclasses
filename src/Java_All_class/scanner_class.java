package Java_All_class;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		
		
		Scanner hj = new Scanner(System.in);
	     System.out.println("Kanish Details");

	    String nextint = hj.nextLine();
		System.out.println("kanish id ="+ nextint);
		
		String next = hj.next();
		System.out.println("kanish name ="+ next);
		
		String next2 = hj.next();
		System.out.println("kanish email ="+ next2);
		
		int nextInt2 = hj.nextInt();
		System.out.println("kanish phnum ="+ nextInt2);
		
		float nextFloat = hj.nextFloat();
		System.out.println("kanish salary ="+nextFloat);
		
		String next3 = hj.next();
		System.out.println("kanish gender ="+next3);
		
		String next4 = hj.next();
		System.out.println("kanish city ="+next4);
	}
			
	}

