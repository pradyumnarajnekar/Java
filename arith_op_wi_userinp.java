//Write a Java program to perform arithmetic operations by takin input from the user (using methods).

import java.util.Scanner; 
class userarith 
{ 
 public static void main(String[] args) 
 { 
 Scanner in = new Scanner(System.in); 
 System.out.println("Enter the first number : "); 
 int num1 = in.nextInt(); 
 System.out.println("Enter the second number : "); 
 int num2 = in.nextInt(); 
 int sum = num2 + num1; 
 int diff = num2 - num1; 
 int prod = num2 * num1; 
 float div = num2 / num1; 
 float mod = num2 % num1; 
 System.out.println("The sum is " + sum); 
 System.out.println("The difference is " + diff); 
 System.out.println("The product is " + prod); 
 System.out.println("The ratio is " + div); 
 System.out.println("The modulus is " + mod); 
 } 
}
