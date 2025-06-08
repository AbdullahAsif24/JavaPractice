import java.util.Scanner;

public class PaperPractice {
  public static void main(String[] args) {

    // finding common elements in arrays and store in another array
    // int[] arr1 = { 15, 28, 7, 63, 42 };
    // int[] arr2 = { 91, 67, 15, 31, 53 };

    // int[] resultArr = new int[1];

    // for (int i = 0; i < arr1.length; i++) {
    // for (int j = 0; j < arr2.length; j++) {
    // if (arr1[i] == arr2[j]) {
    // resultArr = new int[] { arr1[i] };
    // break;
    // }
    // }
    // }
    // System.out.println("Comment number is " + resultArr[0]);

    // ----------------------------------------------------------------------------------
    // //







    

    // Q1. An integer number 2025 is given. You are required to find a number
    // between 21 and 25 (inclusive) such that when 2025 is divided by that number,
    // the remainder is 0.
    // Write a Java program to find and display the correct number.
    // for (int i = 21; i <= 25; i++) {
    // if (2025 % i == 0) {
    // System.out.println("The number is " + i);
    // break;
    // }
    // }

    // ------------------------------------------------------------- //
    









    // Convert the given for loop into a while loop.
    // Then, convert the same logic into a do-while loop.
    // Your output should remain the same.

    // for (int i = 1, j = 10; i <= 5; i++) {
    //   System.out.println("i = " + i + ", j = " + j);
    // }

    // int l = 1, k = 10;
    // while (l <= 5) {
    //   System.out.println("l = " + l + ", k = " + k);
    //   l++;
    // }
    
    // do {
      //   System.out.println("l = " + l + ", k = " + k);
      //   l++;
      // } while (l <= 5);




      // ------------------------------------------------------------- //
      
      
      


      
      //You are given the following Java code with a for loop. Rewrite the same logic using a while loop and then using a do-while loop.
      
      // int m = 0; // assuming m is initialized
        // for (int k = 5; k <= 20; m = m + k, k += 3) {
        //     System.out.println("Value of m: " + m + ", Value of k: " + k);
        // }
        
        // int k=5;
        // while(k<=20){
          //   System.out.println("Value of m: " + m + ", Value of k: " + k);
          //   m = m + k;
          //   k += 3;
          // }
        
        // do {
          //     System.out.println("Value of m: " + m + ", Value of k: " + k);
          //     m = m + k;
        //     k += 3;
        
        // } while (k<=20);


        // -------------------------------------------------------------------------- //
        




        

        //Write a Java program that takes a time input in 24-hour format (e.g., "14:30") and a GMT offset (e.g., +5, -3, etc.), and then converts the input time to the corresponding time in that GMT offset.

        //Instructions:
              //You may use Scanner to take two inputs: the time string and the offset.
              //Split the time into hours and minutes using string manipulation.
              //Perform integer arithmetic to apply the GMT offset.
              //Format the final time in HH:MM format, ensuring leading zeros if needed (e.g., 09:05).
        
        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter time in 24-hour format (HH:MM): ");
        String time = sc.next();
        System.out.print("Enter GMT offset (e.g., +5, -3): ");
        int offset = sc.nextInt();

        // Step 2: Split into hours and minutes
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        // Step 3: Add offset
        int newHour = (hour + offset) % 24;
        // Step 4: Handle negative hours (wrap around)
        if (newHour < 0) {
            newHour += 24;
        }

        // Step 5: Format and print
        System.out.printf("Local Time: %02d:%02d\n", hour, minute);
        System.out.printf("GMT%+d Time: %02d:%02d\n", offset, newHour, minute);


      
  }// main
}// class