import java.util.Scanner;

public class DecToBin
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number to convert to binary: ");
        int dec = input.nextInt();
        String answer = "";
        
        while (dec >=1) {
            if(dec % 2 == 0) 
                answer += 0;
            else 
                answer += 1;
            
            dec /= 2;
        }
        // 'answer' is correct but needs to be flipped
        for(int i = answer.length()-1; i>=0; i--)
            System.out.print(answer.charAt(i) );
    }
}
