package chuong3;

import java.util.Scanner;

public class bai51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương :");
		int num = sc.nextInt();
		if (num >= 0) {
			int giaithua = 1;
			for (int i = 1; i <= num; i++)
				giaithua *= i;
			System.out.println("Giai thua la: " + giaithua);
		} else {
			System.out.println("Chỉ tính được giai thừa số nguyên dương");
		}
	}
}
