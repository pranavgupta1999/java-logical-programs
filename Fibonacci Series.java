import java.util.Scanner;

import Utility.Util;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the First number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter how many no series you want : ");
		int limit = sc.nextInt();

		Util.fibonachi(num1, num2, limit);
	}
}