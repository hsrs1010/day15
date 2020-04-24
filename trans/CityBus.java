package com.trans;

public class CityBus extends Trans {

	public CityBus(int cnt, int dis, int dan) {
		super(cnt, dis, dan);

	}

	@Override
	public int getCharge() {

		return cnt * dis * dan;
	}

}
