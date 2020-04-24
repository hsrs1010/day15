package com.one;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		int eachsum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(intArray.length + "개의 정수를 입력");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];

		}
		System.out.println("총액 : " + sum);
		System.out.println("평균 : " + (double) sum / intArray.length);

		// foreach로 출력
		int cnt = 0;
		for (int k : intArray) {
			cnt++;
			if (cnt == 2) {
				continue;

			}
			eachsum += k;
		}
		System.out.println("총액2 : " + eachsum);
	}

}
