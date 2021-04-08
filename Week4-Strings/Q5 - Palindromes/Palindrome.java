public class Palindrome {

    public static void main(String [] args) {
        String text = "Navan";
        String PalCheck = "";
        
        for(int i = text.length()-1; i >= 0; i--)
            PalCheck += text.charAt(i);
        
        if(text.equalsIgnoreCase(PalCheck)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}
