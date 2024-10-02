import java.util.Scanner;

public class QuadraticEquation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter value a : ");
            double a = scanner.nextDouble();
            System.out.print(" Enter value b : ");
            double b = scanner.nextDouble();
            System.out.print(" Enter value c : ");
            double c = scanner.nextDouble();
        // Tinh delta
            double delta = b * b - 4 * a * c ; 

        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a) ;
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(" The solutions of the equation are: ");
            System.out.println(" x1 :" + x1);
            System.out.println(" x2: " + x2);
        }
        else if (delta==0){
            double x = (-b) / (2 * a);
            System.out.println(" The equation has one double root:");
            System.out.println(" x: " + x);
        }
        else {
            double re = (-b) / (2 * a);
            double im = Math.sqrt(-delta) /(2 * a);
            System.out.println(" The equation has complex solutions:");
            System.out.println(" x1 = " + re + "+" +im+ "i");
            System.out.println(" x2 = " + re + "-" +im+ "i");
        }
        scanner.close();
    }
}
