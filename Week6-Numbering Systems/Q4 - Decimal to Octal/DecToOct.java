import java.util.Scanner;
 
public class DecToOct 
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int dec = input.nextInt();
        String answer = "";
 
        while (dec >= 1) {
            int x = dec % 8;;
            answer = answer + x;
            dec = dec / 8;
        }
 
        //System.out.print(answer);
        for (int i = answer.length()-1;i>=0;i--)
            System.out.print(answer.charAt(i));
    }
}
