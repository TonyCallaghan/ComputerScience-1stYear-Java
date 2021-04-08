import java.util.Scanner;

public class PrintEven 
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s1 = input.nextLine();
        
        for(int i = 0; i < s1.length(); i++) 
            if (i % 2 == 0)
                System.out.print(s1.charAt(i));
    }
}
