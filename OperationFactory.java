/**
 * @author V
 * @version 1.0
 * @description  to instantiate the operation object
 */
package simpleFactory;

public class OperationFactory {

	public static Operation createOperation(String symbol){
		
		Operation oper = null;
		switch (symbol) {
		case "+":
//			oper = new Operation();		//here is the place to think about again . 接口 和 继承
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
		}
		
		return oper;
	}
}
