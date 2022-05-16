import java.util.Scanner;
import java.lang.*;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = sc.nextInt();

        
        // if(typeOf a)
        try{
            System.out.println ("a + b = " + (a + b));
        } catch (ArithmeticException e) {
            System.out.println ("Co loi xay ra" + e.getMessage());
        }
    }
}