public class HowMany {

    public static void main(String [] args) {
        int num = 40, result = 0;
        
        while (num > 2) { 
            num = num / 2;
            result++;
        }
        System.out.println(result); //amount of times 'num' can be divided into 2
    }
}
