public class Compare {

    public static void main(String [] args) {
        String text1 = "programming";
        String text2 = "prOgramming";
        
        boolean exact = text1.equals(text2); //.equals returns bool
        boolean similiar = text1.equalsIgnoreCase(text2);
        
        if(exact == true) {
            System.out.println("Exactly the same: " + exact);
        } else if(similiar == true) {
            System.out.println("Exactly the same: " + exact);
            System.out.println("Similiar: " + similiar);
        } else {
            System.out.println("Exactly the same: " + exact);
            System.out.println("Similiar: " + similiar);
        }
    }
}
