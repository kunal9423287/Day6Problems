package Day6probs;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=1;
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum=n1+n2;
			System.out.println(" "+sum);
			
			
			n1=n2;
			n2=sum;
		}
		
		
		
		
		
		
		
		
		
	}

}
