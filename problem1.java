import java.util.*;
import java.math.*;

class GFG
{
	public static int getMaximumSum (int arr[]) {
		
		int n = arr.length;
		
		int max = -1;
		for(int i = 0; i < n; i++)
		{
			max = Math.max(max, arr[i]);
		}
		
		int []freq = new int[max + 1];
		
		for(int i = 0; i < n; i++)
		{
			freq[arr[i]]++;
		}
		
		int ans = 0, i=max;
		
		while(i>0){
			
			if(freq[i] > 0){
				ans += i;
				freq[i-1]--;
				
				freq[i]--;
			}else{			
			
				i--;
			}		
		}
		
		return ans;
	}

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int n =sc.nextInt();
			int[] arr;
			arr=new int[n]; 
			System.out.println("Enter array");
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
				}
		System.out.println(getMaximumSum(arr));
	}
}