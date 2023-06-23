public class swapping_three_numbers
{
public static void main(String[] args)
{
int num1= 10; int num2=-20; int num3= 0;
// Printing values of numbers before swapping in order to see the change

System.out.println("Original values before swapping are:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2); 
System.out.println("Value of number 3 is " +num3);
num1 = num1+ num2+ num3; 
num2 = num1- (num2+ num3);
num3 = num1- (num2+ num3); 
num1 = num1- (num2+ num3);

// Printing values of numbers after swapping in order to see the change

System.out.println("Values after swapping are:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2);
System.out.println("Value of number 3 is " +num3);
}
}
