public class SummingUp {

     public static void main(String []args) {
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i <= 100; i++) {
            
            if(i % 13 == 0)
                num1 += i;
            
            num2 += i * i;
        }
        
        System.out.println("The sum of all numbers divisible by 13 is " + num1);
        System.out.println("The sum of all numbers squares is " + num2);
     }
}
