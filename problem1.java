import java.util.*;
import java.math.*;

class Problems
{
	public static int getMaximumSum (int arr[],int k) {
		
		int n = arr.length;  
		
		int ct=1;
		int sum=arr[n-1];
		
		for(int i=n-2;i>=0;i--){
		   if(arr[i]==arr[i+1]){
		       sum=sum+arr[i];
		   }
		   else{
		       ct++;
		       if(ct>k) 
		         break;
		       sum=sum+arr[i];
		   }
		}
		return sum;
	
	}

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int n =sc.nextInt();
			int[] arr;
			arr=new int[n]; 
			System.out.println("Enter k");
			int k=sc.nextInt();
			System.out.println("Enter array");
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
				}
			Arrays. sort(arr);
		System.out.println(getMaximumSum(arr,k));
	}
}
