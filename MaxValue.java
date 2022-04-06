package array1;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[] = {20,39,47,36,38 };
		
		int max = arr[0];
		
		for( int i=1; i<arr.length;i++) {
			
			if(arr[i]>max) {
			max=arr[i];
			}	
		}
		System.out.println("max element is array is :"+max);
		
		
		
		
	}

}
