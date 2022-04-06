package Day6probs;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int num = sc .nextInt();
		
		int r;
		
		while(num>0) {
			
			
			r=num%10;
			System.out.print(r);
			
			num=num/10;
			
			
		}
		
		
		
		
		
		
		
	}

}
