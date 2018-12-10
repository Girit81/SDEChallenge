package com.paytm.util;

import java.util.ArrayList;

public class MovingAvergeListImpl implements MovingAvergeList {
	
	private ArrayList<Integer> numbers;
	private int aggregatedVal;
	
	public MovingAvergeListImpl() {
		this.numbers = new ArrayList<>();
	}

	@Override
	public Integer moveWithAvg(Integer e) {
		if(e == null) throw new NullPointerException();
		numbers.add(e);
		aggregatedVal += e.intValue();
		int movingAvg = aggregatedVal / numbers.size();
		return Integer.valueOf(movingAvg);
	}

	@Override
	public Integer get(int index) {
		return numbers.get(index);
	}

}
