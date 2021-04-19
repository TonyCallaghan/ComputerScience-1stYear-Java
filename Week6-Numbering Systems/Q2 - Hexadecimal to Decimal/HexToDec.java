import java.util.Scanner;

public class HexToDec
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hexdecimal number to be coverted to Decimal: ");
        String hex = input.nextLine().toUpperCase();
        int power = hex.length()-1;
        int answer = 0;
        
        for(int i = 0; i <= hex.length()-1; i++) {
            int x = 1;
            switch(hex.charAt(i)) {
                case 'A': x = 10; break;
                case 'B': x = 11; break;
                case 'C': x = 12; break;
                case 'D': x = 13; break;
                case 'E': x = 14; break;
                case 'F': x = 15; break;
                default: x = Character.getNumericValue(hex.charAt(i));
            }
            int sixt = x * (int) Math.pow(16,power);
            answer += sixt;
            power--;
        }
        System.out.println(answer);
    }
}
