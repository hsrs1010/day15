package com.trans;

public class Train extends Trans {

	public Train(int cnt, int dis, int dan) {
		super(cnt, dis, dan);

	}

	@Override
	public int getCharge() {

		return cnt * dis * dan;
	}

}
