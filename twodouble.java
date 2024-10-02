import java.util.Scanner;

public class twodouble {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị a và b
        System.out.print(" Hinh - Enter value a: ");
        double ahinhnt = sc.nextDouble();
        System.out.print(" Hinh - Enter value b: ");
        double bhinhnt = sc.nextDouble();
    
        double sum =  ahinhnt + bhinhnt ; 
        double difference = ahinhnt - bhinhnt;
        double product = ahinhnt * bhinhnt ; 
        
        double quotient ;
            if(bhinhnt !=0) {
                quotient = ahinhnt/bhinhnt;
            }
            else {
                System.out.println( "Loi phep tinh ");
                quotient = Double.NaN;
            }
            System.out.println("sum : " + sum);
            System.out.println("difference: " + difference);
            System.out.println("product: " + product);
            if (!Double.isNaN(quotient)) {
                System.out.println("quotient: " + quotient);
            }
            sc.close();
        }
    }