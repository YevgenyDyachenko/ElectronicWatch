package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()) {
			System.out.println("Give me a number");
			scan.next();
		}
		int m = scan.nextInt();
			
		scan.close();
				
		System.out.printf("%d:%02d:%02d", m/3600%24, m%3600/60, m%60);
		

	}

}
