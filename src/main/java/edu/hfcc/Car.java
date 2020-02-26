package edu.hfcc;

import edu.hfcc.exception.LowFuelException;

public abstract class Car {
	
	private double fuelTankCapatcity;
	private double currentFuelAmount;
	
	public Car (double fuelTankCapatcity, double currentFuelAmount) {
		this.fuelTankCapatcity = fuelTankCapatcity;
		this.currentFuelAmount = currentFuelAmount;
	}

	public double getFuelTankCapatcity() {
		return fuelTankCapatcity;
	}
	
	public void alertLowFuel() throws LowFuelException  {
		double fuelPercentage = this.currentFuelAmount/fuelTankCapatcity;
		if (fuelPercentage <= 0.25) {
			
		 throw new LowFuelException();
		}
	}
	

}
