package Day6probs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc .nextInt();
		
		int sum=0;

		for(int i=1; i<n ; i++) {
			
			if(n%i==0) {
				
				sum=sum+i;
			}
			
			}
			if (n == sum) 
				System.out.println("perfect number");
			
			else 
				System.out.println("not perfect number");
				
			
			}
			
			
	}

