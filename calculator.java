import java.util.Scanner;

public class calculator extends calculation{

	public static void main(String[] args) {
		
		//Variable declaration
		 float op1, op2;
		 char operator;
		 
		 calculator myCalc = new calculator();
		 Scanner sc = new Scanner(System.in);
		 
		//Input operands & operator
		 System.out.println("Enter operand 1: ");
		 op1 = sc.nextFloat();
		 System.out.println("Enter operand 2: ");
		 op2 = sc.nextFloat();
		 System.out.println("Enter the operator (+,-,*,/,%): ");
		 operator = sc.next().charAt(0);
		 sc.close();
		 		 
		//Calculation
		 switch (operator) {
		 
		 case '+':
			 System.out.println("Addition:");
			 System.out.println(myCalc.addition(op1, op2));
			 break;
		 
		 case '-':
			 System.out.println("Subtraction:");
			 System.out.println(myCalc.subtraction(op1, op2));
			 break;
		 
		 case '*':
			 System.out.println("Multiplication:");
			 System.out.println(myCalc.multiplication(op1, op2));
			 break;
		 
		 case '/':
			 System.out.println("Division:");
			 System.out.println(myCalc.division(op1, op2));
			 break;
		 
		 case '%':
			 System.out.println("Modulo:");
			 System.out.println(myCalc.modulo(op1, op2));
			 break;
		 
		 default:
			 System.out.println("Invalid operator. Exiting program.");
			 break;
		 }
	}
	
}
