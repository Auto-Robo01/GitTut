import java.util.*;

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter (1) for addition and (2) for subtraction (3) for multiplication (4) for division.");
		int check = sc.nextInt();
		int c;
		if(check == 1) {
			c = a + b;
		}
		
		else if(check == 2){
		c = a - b;
		}
		else if(check ==3) {
			c = a * b;
		}
		else {
			c = a/b;
		}
		
		System.out.print("Result: " +c);

	}
}
