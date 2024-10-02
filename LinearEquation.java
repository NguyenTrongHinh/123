import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : ");
        double a = sc.nextDouble();
        System.out.println("Enter value b : ");
        double b = sc.nextDouble();


        if(a ==0 ){
            if(b==0){
                System.out.println(" Phuong trinh vo so nghiem : ");
            }
            else {
                System.out.println(" Phuong trinh vo nghiem : ");
            }
        }
        else {
            double x = (-b) / (a) ;
            System.out.println(" Phuong trinh co nghiem la : x = " +x);
        }
    }    
}
