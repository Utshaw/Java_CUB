import java.util.Scanner;

public class Driver {

    public static int foo() {
        Scanner scanner = new Scanner(System.in);
        try{
            int age = scanner.nextInt();
            return 100 / age;
        }catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("INSIDE CATCH");
        }
        finally {
            System.out.println("INSIDE FINALLY");
            scanner.close();
        }
        System.out.println("OUTSIDE TRY");

        return -1;
    }

    public static void main(String[] args) throws InterruptedException {


    // I*am*person
        // I am person
    // If age >= 25 Selim can enter the party
        // other he can't

        CCTV cctv = new CCTV();;
        cctv.startCapture();
        Thread.sleep(1000);
        cctv.turnOffCapturing();
    }
}
