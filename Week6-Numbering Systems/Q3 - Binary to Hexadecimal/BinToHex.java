import java.util.Scanner;
 
public class Main 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary: ");
        String bin = input.nextLine();
        int power = bin.length()-1;
        int decAns = 0;
        String answer = "";
        
        // turn bin to dec
        for (int i = 0; i<=bin.length()-1; i++)
        {
            if (bin.charAt(i) == '1')
            {
                int x = (int) Math.pow(2,power);
                decAns = decAns + x;
            }
            power--;
        }
 
        // to dec to hex
        while(decAns>=1)
        {
            int x = decAns % 16;
            char add = (char)x;
            if (x>9) {
                switch (x) {
                case 10: add = 'A'; break;
                case 11: add = 'B'; break;
                case 12: add = 'C'; break;
                case 13: add = 'D'; break;
                case 14: add = 'E'; break;
                case 15: add = 'F'; break; 
                }
                answer = answer + add;
            } else {
                answer = answer + x;
            }
            decAns = decAns / 16;
        }
        
        for(int i = answer.length()-1; i >= 0; i--)
            System.out.print(answer.charAt(i));
    }
}
