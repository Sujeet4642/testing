package com.visionit.calcoopapproach;

public abstract class AbstractCalcOperation {
	
	protected int num1;
	protected int num2;
	protected int num3;
	protected int result;
    
	
	
	protected int getResult() {
		return result;
	}
	   protected abstract void performOperation();
    	
    
}
