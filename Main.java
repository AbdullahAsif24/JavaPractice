import java.util.Scanner;

class Main {

    // Simple Calculator
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

        System.out.println("Enter x1");
        double X1 = myObj.nextDouble();
        System.out.println("Enter x2");
        double X2 = myObj.nextDouble();
        System.out.println("Enter y1");
        double Y1 = myObj.nextDouble();
        System.out.println("Enter y2");
        double Y2 = myObj.nextDouble();

        double d = Math.sqrt(((Y2 - Y1) * (Y2 - Y1)) + ((X2 - X1) * (X2 - X1)));

        System.out.println("Distance is " + d);
    }


    // Function for adding two fractions
    public static void FracAdd() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter fraction 1");
        String frac1 = myObj.nextLine();

        while (!(frac1.contains("/"))) {
            System.out.println("Again Enter fraction 1");
            frac1 = myObj.nextLine();
        }

        int num1 = Integer.parseInt(frac1.split("/")[0]);
        int den1 = Integer.parseInt(frac1.split("/")[1]);


        System.out.println("Enter fraction 2");
        String frac2 = myObj.nextLine();
        
        while (!(frac2.contains("/"))) {
            System.out.println("Again Enter fraction 2");
            frac2 = myObj.nextLine();
        }

        int num2 = Integer.parseInt(frac2.split("/")[0]);
        int den2 = Integer.parseInt(frac2.split("/")[1]);


        double ansNum = ((num1*den2) + (den1* num2));
        double ansden = (den1*den2);

        System.out.println("Answer is "+ ansNum + "/" + ansden);
    }

    // function to do matrix multiplication
    public static void MulMatrices(){
        int[][] mat1 = {{2,3,4},{4,5,9}};
        int[][] mat2 = {{6,7,10},{8,9,5}};
        int[][] result = new int[mat1.length][mat2[0].length];
        int sum = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                sum += mat1[0][j] * mat2[j][0];
                result[i][j] = sum; 
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        // calculator();

        // distance();

        // FracAdd();

        MulMatrices();
    }
}