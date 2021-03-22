package hello;

import java.util.Scanner;

public class SortOnArrayOfIntegers {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the count of numbers");
		int count = scan.nextInt();

		int number[] = new int[count];

		System.out.println("Enter the numbers");
		for (int i = 0; i < count; i++) {
			number[i] = scan.nextInt();
		}

		scan.close();
		int temp = 0;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {

				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}

		}
		System.out.println("After sorting array element");
		for (int k = 0; k < count; k++) {
			System.out.print(number[k] + " ");
		}

	}

}
