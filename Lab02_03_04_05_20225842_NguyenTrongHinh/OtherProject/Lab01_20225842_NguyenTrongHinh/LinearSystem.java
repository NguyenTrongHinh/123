import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhap gia tri a1 : ");
        double a1 = sc.nextDouble();
        System.out.println(" Nhap gia tri b1 : ");
        double b1 = sc.nextDouble();
        System.out.println(" Nhap gia tri c1 : ");
        double c1 = sc.nextDouble();
        System.out.println(" Nhap gia tri a2 : ");
        double a2 = sc.nextDouble();
        System.out.println(" Nhap gia tri b2 : ");
        double b2 = sc.nextDouble();
        System.out.println(" Nhap gia tri c2 : ");
        double c2 = sc.nextDouble();

        double det = (a2 * b1 - a1 * b2 );
        if(det==0){
            if(c1/c2 == a1/a2 || c1/c2 == b1/b2){
                System.out.println(" He phuong trinh vo so nghiem :");
            }
            else{
                System.out.println(" He phuong trinh vo nghiem ");
            }
        } 
        else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            System.out.println("Nghiem cua he phuong trinh la :");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
