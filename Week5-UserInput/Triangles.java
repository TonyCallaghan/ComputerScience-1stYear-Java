import java.util.Scanner;

public class Triangles 
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st num:");
        double sideA = input.nextDouble();
        System.out.println("Enter 2nd num:");
        double sideB = input.nextDouble();
        System.out.println("Enter 3rd num:");
        double sideC = input.nextDouble();
        
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            System.out.println("This is not a triangle");
        } else if (sideA == sideB && sideA == sideC) {
            System.out.println("This is an equilateral triangle");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("This is an isoceles triangle");
        } else {
            System.out.println("This is a scalene triangle");
        }
    }
}
