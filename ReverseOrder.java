package array1;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = new int [5];
		
		Scanner ne = new Scanner(System.in);
		System.out.println("Enter the number");
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=ne .nextInt();
		}
		
		for(int i=0;i<ar.length;i++) {
	System.out.println(ar[i]);
		}
		
		
		for(int i=ar.length-1;i>0;i--) {
			System.out.print(ar[i]+"in reverse order");
		}
		
		
		
		
	}

}
