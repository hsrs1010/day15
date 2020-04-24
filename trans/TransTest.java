package com.trans;

public class TransTest {
	public static void printpay(Trans tran) {
		System.out.println("================");
		System.out.println(tran);
		System.out.println("----------------");
		System.out.println(tran.getCharge());
	}

	public static void main(String[] args) {
		// Trans tr = new Train(10, 100, 2000);
		// System.out.println(tr);

		Trans[] tran = new Trans[3];

		tran[0] = new Train(10, 100, 700);
		tran[1] = new Express(5, 100, 500);
		tran[2] = new CityBus(20, 100, 200);
		// printpay(tran[0]);
		// printpay(tran[1]);
		// printpay(tran[2]);

		for (int i = 0; i < tran.length; i++) {
			printpay(tran[i]);
		}
	}
}
