package simpleFactory;


	
public class OperationAdd extends Operation{
		
		public double getResult(){
			double result = 0;
			result = super.numberA + super.numberB;
			return result;
		}
}

