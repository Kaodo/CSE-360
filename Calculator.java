

//Kaodilichi Nwuda
//Wednesday Session
//Class ID: 514

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		total -= value;
	}
	
	public void divide (int value) {
		total /= value;
	}
	
	public String getHistory () {
		String add = Calculator.add(4);
		String subtract = Calculator.subtract(2);
		String multiply = Calculator.multiply(20);
		String divide = Calculator.divide(2);
		return "0 + add - subtract * multiply /divide";
	}
}