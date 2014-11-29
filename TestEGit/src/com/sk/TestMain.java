package com.sk;

import com.sk.Impl.Mobiles;

public class TestMain implements Mobiles {

	public static void main(String[] args) {

		TestMain tm = new TestMain();
		tm.showMobs();
	}

	public void showMobs() {
		System.out.println("override showMobs() in main !!");
	}

}
