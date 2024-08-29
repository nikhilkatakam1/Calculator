package com.operation.calculator.operation;

import com.operation.calculator.Calculator.Calculator;

public class ExecuteOperation {
	

	 public static void main(String[] args) {
		 //This is setup as a service but this has been setup in the main function just as a demonstration
	        Calculator calculator = new Calculator(10);

	        double result = calculator
	                            .performOperation(MathOperator.ADDITION, 5,7)
	                            .performOperation(MathOperator.SUBTRACTION, 6)
	                            .performOperation(MathOperator.MULTIPLICATION, 8)
	                            .performOperation(MathOperator.DIVISION, 8)
	                            .getValue();

	        System.out.println("Result: " + result); 

	        double customResult = calculator
	                .performCustomOperation((x, y) -> Math.pow(x, y), 2,8)
	                .getValue();

	        System.out.println("Custom Operation Result: " + customResult);  // Output: 256
	    }

}
