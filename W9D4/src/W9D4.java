import java.util.Scanner;

	/*
	 * @author Sumit Kumar
	 * @version 1.0    2018-03-06  
	 */

public class W9D4 {
	
		public static void main(String[] args) {
			Scanner S = new Scanner(System.in);
			
			
			System.out.println("Enter your first value:");
			double Value1 = S.nextDouble();
			
			System.out.println("Enter ErrorTerm of first value:");
			double errorterm1 = S.nextDouble();

			
			System.out.println("Enter your second value:");
			double Value2 = S.nextDouble();
					
			System.out.println("Enter ErrorTerm of second value");
			double errorterm2 = S.nextDouble();
		
			
			System.out.println("Specify the function you want to do(+, -, /, *)");
			
			double add_result = Value1 + Value2;
			double errorterm_add = errorterm1 + errorterm2;
			
			double sub_result = Value1 + Value2;
			double errorterm_sub = errorterm1 + errorterm2;
			
			double product_result = (Value1 * Value2);
			double error_fraction1 = (errorterm1 / Math.abs(Value1));
			double error_fraction2 = (errorterm2 / Math.abs(Value2));
			double product_error_term = ((error_fraction1 + error_fraction2) * Math.abs(product_result ));
			
			double Quotient_result = (Value1 / Value2);
			double Quotient_error_term = ((error_fraction1 + error_fraction2) * Math.abs(Quotient_result));
			
			String input = S.next();
			
			if (input.equals("+")) {
				System.out.println("Answer: " + add_result + " ± " + errorterm_add);
			}
			else if(input.equals("-")) {
				System.out.println("Answer: " + sub_result + " ± " + errorterm_sub);
			}
			else if(input.equals("*")){
				System.out.println("Answer: " + product_result + " ± " + product_error_term);
			}
			else if(input.equals("/")) {
				System.out.println("Answer: " + Quotient_result + " ± " + Quotient_error_term);
			}
			else {
				System.out.println("Invalid entry, choose from (+, -, / or *");
			}
			S.close();
		}

	}
