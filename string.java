package luyentapthem;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chuỗi: ");
		String inputString = scanner.nextLine();

		int demkitu = 0;
		int numVowels = 0;
		int numConsonants = 0;

		String vowels = "aeiouAEIOU";

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			demkitu++;
			if (Character.isLetter(c)) {
				if (vowels.indexOf(c) != -1) {
					numVowels++;
				} else {
					numConsonants++;
				}
			}
		}

		System.out.println("Số ký tự: " + demkitu);
		System.out.println("Số nguyên âm: " + numVowels);
		System.out.println("Số phụ âm: " + numConsonants);

		scanner.close();
	}
}
