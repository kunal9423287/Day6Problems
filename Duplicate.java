package array1;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = { "java","c","c++","java","python"};
		
		boolean flag=false;
		for(int i=0; i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) 
				{
				System.out.println("the duplicate word is "+str[i]);
				 flag =true;}
			}
		}
		
		if(flag==false) {
			System.out.println("there is no duplicate word in this array");
		}
		
		
		
		
		
		
		
	}
		
}
	


