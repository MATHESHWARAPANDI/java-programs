public class swapping_using_temp
{
public static void main( String[] args)
{
int num1=20; int num2 =-45; int num3 =0;

// Printing values of numbers before swapping in order to see the change

System.out.println("Original values before swapping are:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2); 
System.out.println("Value of number 3 is " +num3);
int temp = num1; num1 = num2; num2= num3;num3= temp;

// Printing values of numbers after swapping in order to see the change

System.out.println("Values after swapping are:");
System.out.println("Value of number 1 is " +num1);
System.out.println("Value of number 2 is " +num2); 
System.out.println("Value of number 3 is " +num3);
}
}
