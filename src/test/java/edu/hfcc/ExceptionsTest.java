package edu.hfcc;

import org.junit.jupiter.api.Test;

import edu.hfcc.exception.LowFuelException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class ExceptionsTest {
    
	@Test
	public void verifySummingWorks() {
		int[] input = {2,4,6,8};
		
		int actual = new Exceptions().sumNumbersOneException(input);
		
		assertEquals(20, actual);
	}
	
	@Test 
    public void verifyNullPointerException() {
    	
		int actual = new Exceptions().sumNumbersOneException(null);
		
		assertEquals(0, actual);
    }
	
	@Test 
    public void verifyHandingMultipleExceptions() {
		int[] input = {2,4,6,8};
		
		int actual = new Exceptions().sumNumbersTwoException(input);
		int actual1 = new Exceptions().sumNumbersTwoException(null);
		
		assertEquals(18, actual);
		assertEquals(0, actual1);
    }
	
	@Test 
    public void verifyHandingMultipleExceptionsAndThrowException() {
		int[] input = {2,4,6,8};
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> {new Exceptions().sumNumbersTwoExceptionThrowingExceptions(input);});
		Assertions.assertThrows(NullPointerException.class,
				() -> {new Exceptions().sumNumbersTwoExceptionThrowingExceptions(null);});
		
    }
	
	@Test void verifyLowFuelCapacity() {
		
		Car f150 = new FordF150(10);
		Assertions.assertThrows(LowFuelException.class,
				() -> {new Exceptions().checkFuelAmount(f150);});
	}
}
