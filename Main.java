import java.util.Scanner;

class Main {
    public static void calculator() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double Fn = myObj.nextDouble();

        System.out.println("Enter Second Number: ");
        double Sn = myObj.nextDouble();

        System.out.println("Enter Operation: ");
        System.out.println("1. For Addition ");
        System.out.println("2. For Subtraction ");
        System.out.println("3. For Multiplication ");
        System.out.println("4. For Devision ");

        int Op = myObj.nextInt();

        if (Op == 1) {
            System.out.println("Addition is " + (Fn + Sn));
        } else if (Op == 2) {

            System.out.println("Subtraction is " + (Fn - Sn));
        } else if (Op == 3) {

            System.out.println("Multiplication is " + (Fn * Sn));
        } else if (Op == 4) {
            System.out.println("Devision is " + (Fn / Sn));

        } else {
            System.out.println("Write Correct operation");

        }
    }

    // Function for calculating distance
    public static void distance() {
        Scanner myObj = new Scanner(System.in);

        double X1 = myObj.nextDouble();
        double X2 = myObj.nextDouble();
        double Y1 = myObj.nextDouble();
        double Y2 = myObj.nextDouble();

        double d = Math.sqrt(((Y2-Y1)*(Y2-Y1))+((X2-X1)*(X2-X1)));

        System.out.println(d);
    }

    public static void main(String[] args) {
        // calculator();

        distance();
    }
}