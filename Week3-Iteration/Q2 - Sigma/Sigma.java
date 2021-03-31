public class Sigma {

    public static void main(String [] args) {
        int num = 7, sum = num, result = num;
        
        while (sum > 0) { 
            sum--;
            result += sum;
        }
        System.out.println("The sigma of " + num + " is " + result); 
    }
}
