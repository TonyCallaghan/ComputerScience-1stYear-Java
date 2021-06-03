import java.util.Scanner;
 
public class Codes
{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String [] args) {
        check();
    }
    
    public static void check() {
        System.out.println("Enter Modules ");
        String code = input.nextLine().toUpperCase();
        char year = code.charAt(2);
        String mod = code.substring(0,2);
        String module = "";
 
        while (!code.equals("STOP"))  
        {
            switch(mod) {
                case "CS": module = "Computer Science"; break;
                case "EE": module = "Electronic Engineering"; break;
                case "BI": module = "Biology"; break;
                case "MT": module = "Maths"; break;
                case "CH": module = "Chemistry"; break;
                case "CI": module = "Chinese"; break;
                case "BS": module = "Business"; break;
                default: module = "invalid";
            }
 
            if(code.length() < 5||module == "invalid" || (int)year > 52) {
                System.out.println("Invalid module code");
            } else {
            System.out.println(code + " is a valid year " + year + " " + module + " module");
            }
            check();
        }
    }
}
