import java.util.Scanner;
 
public class Main
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary 1: ");
        String bin1 = input.nextLine(); // 1st Number
        System.out.println("Enter binary 2: ");
        String bin2 = input.nextLine(); // 2nd Number
 
        int power = bin1.length()-1, dec1 = 0, dec2 = 0;
        String answer = "";
        
        // turn 1st bin to dec
        for(int i = 0; i<=bin1.length()-1; i++) {
            if (bin1.charAt(i) == '1') {
                int x = (int) Math.pow(2,power);
                dec1 = dec1 + x;
            }
            power--;
        }
        // turn 2nd bin to dec
        power = bin2.length()-1;
        for(int i = 0; i<=bin2.length()-1; i++) {
            if (bin2.charAt(i) == '1') {
                int x = (int) Math.pow(2,power);
                dec2 = dec2 + x;
            }
            power--;
        }

        // add them ..
        int dec = dec1 + dec2;
        
        // change back to binary
        while (dec >= 1) {
            if (dec % 2 == 0)
                answer = answer + "0";
            else if  (dec % 2 == 1)
                answer = answer + "1";
            dec = dec / 2;
        }
        
        // Print out 
        for (int i = answer.length()-1;i>=0;i--)
            System.out.print(answer.charAt(i));
    }
}  
