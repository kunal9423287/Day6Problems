package Day6probs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc .nextInt();
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
				
			}
			
		}
		
		if (count==2) 
			System.out.println("the number is prime");
		
		
		else
			System.out.println("the number is not prime");
		
		
		
		
	}

}
