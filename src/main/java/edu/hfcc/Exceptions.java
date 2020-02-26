package edu.hfcc;

import edu.hfcc.exception.LowFuelException;

public class Exceptions {

	public int sumNumbersOneException(int[] numbers) {

		int sum = 0;
		
		try {
			
			for (int index = 0; index < numbers.length; index++) {
				sum += numbers[index];
			}
		}catch(NullPointerException npe){
			
			return 0;
			
		}
		
		return sum;
	}

	public int sumNumbersTwoException(int[] numbers) {

		int sum = 0;
		try {
			for (int index = 0; index < numbers.length; index++) {
				sum += numbers[index + 1];
			}
		}catch(NullPointerException npe) {
			return 0;
		}catch(ArrayIndexOutOfBoundsException a) {
			return sum;
		}
	
		
		return sum;
	}

	public int sumNumbersTwoExceptionThrowingExceptions(int[] numbers) throws ArrayIndexOutOfBoundsException, NullPointerException{

		
		int sum = 0;
		try {
		for (int index = 0; index < numbers.length; index++) {
				sum += numbers[index + 1];
			}
		}catch(ArrayIndexOutOfBoundsException a) {

			throw new ArrayIndexOutOfBoundsException();
		}
		catch(NullPointerException npe) {
			throw new NullPointerException();
		}

		
		return sum;
		
		
	}
	
	public void checkFuelAmount(Car car) throws LowFuelException {
		car.alertLowFuel();
		
	}
}
