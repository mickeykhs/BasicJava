package chapter06.sec04;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.powerOn();
		
		int result1 = calculator.plus(10,20);
		System.out.println("result1: "+ result1);
		
		double result2 = calculator.divide(10, 3);
		System.out.println("result2: "+ result2);
		System.out.println(calculator.divide(30,15));
		
		calculator.powerOff();
	}
		
}
