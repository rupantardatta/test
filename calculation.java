
public class calculation {
	
	protected float addition (float op1, float op2) {
		float sum = 0;
		float values[] = new float[3];
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		
		for (int i=0; i<values.length; i++) {
			System.out.println(values[i]);
			sum += values[i];
		}
		System.out.println("Sum of array is : "+sum);
		sum = 0;
		float new_values[] = {3, 4, 5};
		for (float currentval:new_values) {
			System.out.println(currentval);
			sum += currentval;
		}
		System.out.println("Sum of array is : "+sum);
		
		return (op1+op2);
	}
	
	public float subtraction (float op1, float op2) {
		
		return (op1-op2);
	}	

	public float multiplication (float op1, float op2) {
		
		return (op1*op2);
	}
	
	public float division (float op1, float op2) {
		
		return (op1/op2);
	}
	
	public float modulo (float op1, float op2) {
		
		return (op1%op2);
	}
}
