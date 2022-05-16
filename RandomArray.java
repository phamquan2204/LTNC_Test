import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
            // System.out.println(arr[i]);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chi muc: ");
        try{
            int index = sc.nextInt();
            System.out.println(arr[index]);
        } catch (Exception e){
            System.out.println("Xuat hien loi: " + e.getMessage());
        }

    }

}
