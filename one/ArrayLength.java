package com.one;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		int eachsum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(intArray.length + "���� ������ �Է�");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];

		}
		System.out.println("�Ѿ� : " + sum);
		System.out.println("��� : " + (double) sum / intArray.length);

		// foreach�� ���
		int cnt = 0;
		for (int k : intArray) {
			cnt++;
			if (cnt == 2) {
				continue;

			}
			eachsum += k;
		}
		System.out.println("�Ѿ�2 : " + eachsum);
	}

}
