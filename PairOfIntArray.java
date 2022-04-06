package array1;

public class PairOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int ar[]= {1,2,3,4,5,6,7};
		
		int low =0;
		int high =ar.length-1;
		int sum=9;
		
		while(low<high) {
			
			if(ar[low]+ar[high]>sum)
			{
				high++;
			}
			else if(ar[low]+ar[high]<sum)
			{
				low++;
			}
			
			else if(ar[low]+ar[high]==sum) 
			{
				System.out.println("pair("+ar[low]+"pair"+ar[high] );
			
					low++;
					high--;
			
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
