import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator{

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
		
			System.out.println("please input number A: ");
			String strNumberA = br.readLine();
			System.out.println("please select symbol(+, -, *, /): ");
			String strOperate = br.readLine();
			System.out.println("please input number B: ");
			String strNumberB = br.readLine();
			String result = "";
			
			switch(strOperate){
				case "+":	result = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB)); 
				break;
				case "-": 	result =String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
				break;
				case "*": 	result = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
				break;
				case "/": 	if(strNumberB != "0"){
								result = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
							}else{
								result = "divisor error"; 
							}
				break;
			}
			
			System.out.println("the result is: " + result);

		}catch(Exception e){
			System.out.println("input error:" + "Calculator.java");
		}
	}
}
