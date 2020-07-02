package com.visionit.calcoopapproach;

public class Multiplication extends AbstractCalcOperation {
	//constructor
	public Multiplication(int num1,int num2) {
	    super.num1=num1;
	    super.num2=num2;
	}
	
	
  
	private void performMultipleops() {
		super.result  = super.num1 * super.num2;
				
	}
	
	@Override
	protected void performOperation(){
    	performMultipleops();
	
	}


}
