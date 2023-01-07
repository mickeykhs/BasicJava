package chapter02;

public class VariableExchangeExample {
   public static void main(String[] args) {
	int x = 3;
	int y = 5;
	System.out.println("x:" + x + ",y:" + y);
	
	int temp;
	temp = x;
	x = y;                  //선언은 한번만!!
	y= temp;           
	System.out.println("x:" + x + ",x:" + y);
   }
}
