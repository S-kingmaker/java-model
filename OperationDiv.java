package simpleFactory;

public class OperationDiv extends Operation{
	
	
	@Override
	public double getResult() throws Exception{
		double result = 0;
		if(super.numberB != 0){
			result = super.numberA - super.numberB;
			return result;
		}else{
			throw new Exception("除数不能为0");
		}
		
	}
}