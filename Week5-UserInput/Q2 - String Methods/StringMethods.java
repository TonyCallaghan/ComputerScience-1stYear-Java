import java.util.Scanner;

public class StringMethods
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s1 = input.nextLine();
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(0,1).toUpperCase() + s1.substring(1));
        System.out.println("The length is: " + s1.length());
        for(int i = 0; i<s1.length()-1; i++)
            System.out.println(s1.charAt(i));
    }
}
