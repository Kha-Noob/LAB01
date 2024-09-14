package luyentapthem;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Nhập các số nguyên (nhập 0 để dừng):");

		while (true) {
			System.out.print("Nhập số: ");
			int number = scanner.nextInt();

			if (number == 0) {
				break;
			}

			numbers.add(number);
		}

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}

		System.out.println("Tổng của các số nguyên là: " + sum);

		scanner.close();
	}
}
