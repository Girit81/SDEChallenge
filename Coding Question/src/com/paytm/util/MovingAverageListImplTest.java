package com.paytm.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovingAverageListImplTest {

	@Test
	void testMovingAverage() {
		MovingAvergeList pastPrices = new MovingAvergeListImpl();
		Integer movingAvg = pastPrices.moveWithAvg(Integer.valueOf(5));
		assertTrue(movingAvg.intValue() == 5, "Incorrect moving average");
		
		movingAvg = pastPrices.moveWithAvg(Integer.valueOf(1));
		movingAvg = pastPrices.moveWithAvg(Integer.valueOf(3));
		movingAvg = pastPrices.moveWithAvg(Integer.valueOf(3));		
		assertTrue(movingAvg.intValue() == 3, "Incorrect moving average");
	}
	
	@Test
	void testMovingAverageWithPrimeNumbers() {
		MovingAvergeList pastPrices = new MovingAvergeListImpl();
		Integer movingAvg = pastPrices.moveWithAvg(Integer.valueOf(5));
		movingAvg = pastPrices.moveWithAvg(Integer.valueOf(2));
		movingAvg = pastPrices.moveWithAvg(Integer.valueOf(4));
		assertTrue(movingAvg.intValue() == 3, "Incorrect moving average");
	}

}
