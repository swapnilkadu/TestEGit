package com.sk;

import com.sk.Impl.Mobiles;

public class TestMain implements Mobiles {

	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.showMobs();
		tm.getWarrenty(1001);
	}

	public void showMobs() {
		System.out.println("override showMobs() in main !!");
	}

	public void showMobSpecs() {
		System.out.println("override showMobSpecs() in main !!");
	}

	@Override
	public void getWarrenty(int mobId) {
		System.out.println("override getWarrenty with handset id: "+mobId);
	}

}
