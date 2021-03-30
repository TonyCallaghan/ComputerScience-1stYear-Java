public class QuadraticEq {

     public static void main(String []args) {
         
        double coord1 = 1;
        double coord2 = 0;
        double coord3 = -1;
        
        double sqRoot = Math.sqrt( (coord2 * coord2) - (4 * coord1 * coord3) ); //square root
        
        if(sqRoot >= 0) {
            double positive = ((coord2 * -1) + sqRoot) / (2 * coord1); // test with +
            double negative = ((coord2 * -1) - sqRoot) / (2 * coord1); //test with -
        
            System.out.println("x = " + positive);
            System.out.println("x = " + negative);
        } else {
            System.out.println("No solutions"); // if sum in sqRoot <0 .. then there are no solutions
        }
     }
}
