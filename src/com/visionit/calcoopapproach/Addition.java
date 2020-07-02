package com.visionit.calcoopapproach;

public class Addition extends AbstractCalcOperation {
	//constructor
	public Addition(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	public Addition(int num1,int num2,int num3) {
		super.num1 = num1;
		super.num2 = num2;
		super.num3 = num3;
	}
	
   //operation
	private void performAddops() {
		super.result  = super.num1 + super.num2;
				
	}
	
	//operation
		private void performAddOperationMultiple() {
			super.result  = super.num1 + super.num2;
					
		}
	
	@Override
	protected void performOperation(){
    	performAddops();
	
	}
}
