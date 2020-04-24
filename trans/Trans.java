package com.trans;

public abstract class Trans {
	protected int cnt;//인원
	protected int dis;//거리
	protected int dan;//단가
	
	public Trans(int cnt, int dis, int dan) {
		this.cnt=cnt;
		this.dis=dis;
		this.dan=dan;
	}
	
	public abstract int getCharge();
	
	@Override
	public String toString() {
		
		return "인원 : "+cnt+" "+ "거리 : "+dis+" "+ "단가 : "+dan;
	}
}
