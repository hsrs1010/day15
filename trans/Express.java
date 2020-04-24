package com.trans;

public class Express extends Trans {

	public Express(int cnt, int dis, int dan) {
		super(cnt, dis, dan);

	}

	@Override
	public int getCharge() {

		return cnt * dis * dan;
	}

}
