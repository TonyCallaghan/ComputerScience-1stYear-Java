import java.util.Scanner;

public class Cap 
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String s1 = input.nextLine().toLowerCase();
        s1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        
        for(int i = 0; i <= s1.length()-1; i++) 
            if (s1.charAt(i) == ' ')
                s1 = s1.substring(0,i+1) + s1.substring(i+1, i+2).toUpperCase() + s1.substring(i+2);
        System.out.println(s1);
    }
}
