package cybrilla_Test;

import java.util.Scanner;

public class Cybrilla {
	// To find the sum of triplets having sum equal to 0
	// An optimized approach can be used to solve this problem in O(N*N) time complexity.
	
		static void findTriplets(int[] arr, int n){
			
				boolean found = false;
				for (int i=0; i<n-2; i++)
				{
					for (int j=i+1; j<n-1; j++)
					{
						for (int k=j+1; k<n; k++)
						{
							if (arr[i]+arr[j]+arr[k] == 0)
							{
								System.out.print(arr[i]);
								System.out.print(" ");
								System.out.print(arr[j]);
								System.out.print(" ");
								System.out.print(arr[k]);
								System.out.print("\n");
								found = true;
							}
						}
					}
				}

				if (found == false)
					System.out.println(" not exist ");

			}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int n =sc.nextInt();
			int[] arr;
			arr=new int[n]; 
			System.out.println("Enter array");
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
				findTriplets(arr, n);

		}
			
	}
