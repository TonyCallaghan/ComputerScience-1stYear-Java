public class UpDown {
  
    public static void main(String [] args) {
        int count = 1;
        
        while (count <= 10) { // While loop
            System.out.print(count + " ");
            count ++;
        }
        System.out.println(""); //break
        
        for (int i = 10; i > 0; i--) // for loop
            System.out.print(i + " "); //{} not required if it's just 1 line
    }
}
