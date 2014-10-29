package simpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try{
			
			System.out.println("please input operation symbol: ");
			String symbol = br.readLine();
			Operation op = OperationFactory.createOperation(symbol);
			System.out.println("please input number1: ");
			String strNumber1 = br.readLine();
			System.out.println("please input number2: ");
			String strNumber2 = br.readLine();
			op.numberA = Double.parseDouble(strNumber1);
			op.numberB = Double.parseDouble(strNumber2);
			double result = op.getResult();
			System.out.println("the result is: " + result);
		}catch(Exception e){
			System.err.println("error");
		}
	}
}
