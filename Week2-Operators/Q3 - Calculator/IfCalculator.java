public class Calculator {
    
    static int num1 = 24;
    static int num2 = 4;

    public static void main(String [] args) {
        char math = '/';
        
        switch(math) {
            case '+': System.out.println(num1 + num2); break;
            case '-': System.out.println(num1 - num2); break;
            case '*': System.out.println(num1 * num2); break;
            case '/': System.out.println(num1 / num2); break;
            default: System.out.println("error");
        }
    }
}
