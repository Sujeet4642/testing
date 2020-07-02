package com.visionit.calcoopapproach;

public class Substraction extends AbstractCalcOperation {
	//constructor
	public Substraction(int num1,int num2) {
	    super.num1=num1;
	    super.num2=num2;
	}
	
	
   //operation
	private void performSubops() {
		super.result  = super.num1 - super.num2;
				
	}
	
	@Override
	protected void performOperation(){
    	performSubops();
	
	}


}
