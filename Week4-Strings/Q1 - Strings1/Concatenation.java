public class Concatenation {

     public static void main(String []args) {
        String s1 = "Computer Science";
        String s2 = "Education";
        
        String newString = s1.substring(8);
        String concatenate = newString + " " + s2;
        
        System.out.println(concatenate);
        // faster way = print(s1.substring(8) +" "+ s2);
     }
}
