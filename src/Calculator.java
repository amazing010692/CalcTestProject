
public class Calculator {

	/*
	 * This is a Camel-Casing ClassName - TheDarkNight 
	 * methodName - theDarkNight
	 */
	
	public Calculator() {
		System.out.println("Calling constructor");
	}

	public void add() {

		System.out.println("Adding some numbers");
	}

	public void sub() {

		System.out.println("Subtract some numbers");
	}

	public void mul() {

		System.out.println("Multiply some numbers");
	}

	public void div() {

		System.out.println("Divide some numbers");
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();

	}

}
