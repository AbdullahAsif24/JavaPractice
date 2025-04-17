import java.util.Scanner;

class Main {
  public static void main(String[] args) {
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
        System.out.println("Addition is "+ (Fn + Sn));
    }else if (Op == 2) {
        
        System.out.println("Subtraction is "+ (Fn - Sn));
    } else if (Op == 3) {
        
        System.out.println("Multiplication is "+ (Fn * Sn));
    }
     else if (Op == 4) {
        System.out.println("Devision is "+ (Fn / Sn));
        
    } else {
        System.out.println("Write Correct operation");
        
    }
  }
}