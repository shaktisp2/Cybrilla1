package cybrilla_Test;

import java.util.Scanner;

public class Problem1 {

// Checking for palindrome eg. "abcba", "sdffds", etc
	
	static boolean isPalindrome(String str)
	{

		int i = 0, j = str.length() - 1;  // To start from leftmost and rightmost corner in string

		while (i < j) {

			if (str.charAt(i) != str.charAt(j))    // comparing characters while they are same
				return false;

			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  
        
        String str = sc.nextLine();
  
	

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
