import java.util.Scanner;

public class Main {


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("nhap vao so nguyen n :");
//        int n = scan.nextInt();
//
//        if (n % 2 != 0) {
//            System.out.println("Weird");
//        } else if ((n >= 2) && (n <= 5)) {
//            System.out.println("Not Weird");}
//            else if (n <= 20) {
//                System.out.println("Weird");}
//                else{
//                    System.out.println("Not Weird");


    public static void main(String[] args) {

        System.out.println("nhap n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;

        for (i = 1; i<=10; i++) {
            System.out.println((+n) + "x"+ (+i) + "=" +(i*n));
        }




    }
}


