import java.util.Scanner;

public class ReplaceA
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String s1 = input.nextLine();
        int a = 0;
        
        for(int i = 0; i < s1.length(); i++) 
            if (s1.charAt(i) == 'a')
                a++;

        if(a >= 3) {
            System.out.println(s1.replace('a', '@'));
        } else if (a < 3) {
            System.out.println(s1.replace('a', '#'));
        } else {
            System.out.println(s1);
        }
    }
}
