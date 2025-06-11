import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DayOfWeek;

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
              
        /* 

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
        
        */
        

        
        // -------------------------------------------------------------------------- //
        
        
        
        
        //5) Write a java program that takes populations and print their average and population that are greater than average
        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of populations: ");
        int totalPop = sc.nextInt();
        int[] popArr = new int[totalPop];
        int total = 0;
        
        System.out.println("Enter population");
        for(int i = 0; i < totalPop; i++){
          popArr[i] = sc.nextInt();
          total += popArr[i];
          }
          
        int avgPop = total/ totalPop;
        System.out.println("Average population is " + avgPop);

        for(int i = 0; i < popArr.length; i++){
          if (popArr[i] > avgPop) {
            System.out.println( "This is greater than avg "+popArr[i]);
          }
        }

        sc.close();
          */



          // -------------------------------------------------------------------------- //
          
          

          //5) Write a java program that prints the given series:
          //1, 4, 9, 16, 25, 36, 49, 64, 81, 100, …………

          // int num = 0;

          // for(int i = 1; num <100; i+=2){
          //     num += i;
          //     System.out.println(num);
          // }
          




          // -------------------------------------------------------------------------- //
          
          
          
          //Write a java program that prints the given series:
          //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ……
          // int num1 = 0;
          // int num2 = 1;
          // for(int f = 0; f <= 55; f=num1+num2){
          //   System.out.println( f);
          //   num1 = num2;
          //   num2= f;
          // }



          // -------------------------------------------------------------------------- //






          
          
          //Write a java program that takes an integer number as string and prints sum of all its digits.  
          //For example if user enters “2594” then it should print 20 because 2+5+9+4=20
          
          // Scanner sc = new Scanner(System.in);
          // System.out.println("Enter numbers: ");
          // String inp = sc.next();
          // String[] numString = inp.split("");
          // int total  = 0;
          // for(int i = 0; i < numString.length; i++){
            //   total += Integer.parseInt(numString[i]);
            // }
            // System.out.println("total is: " + total);
            
            
            // -------------------------------------------------------------------------- //
  
  
  
            //Write a java code that takes an integer representing number of lines of the following 
            //pattern and then print it. 
            //For example: if n = 4: 
            //*
            //* * 
            //* * * 
            //* * * *

      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter number of lines: ");
      // int n = sc.nextInt();
      
      // for(int i = 0 ; i <= n ; i++){
        //   for(int j = 0 ; j < i; j++){
          //     System.out.print("*");
          //   }
          //   System.out.println("");
          // }
          
          



          // -------------------------------------------------------------------------- //
          
          
          

          //Write a java code that takes an integer representing number of lines of the following 
          //pattern and then print it. 
                //For example: if n = 4: 
                //* * * *
                // * * * 
                //  * * 
                //   *

      //     Scanner sc = new Scanner(System.in);
      // System.out.println("Enter number of lines: ");
      // int n = sc.nextInt();
      
      // for(int i = n ; i >= 0 ; i--){
      //     for(int j = 0 ; j < i; j++){
      //         System.out.print("*");
      //       }
      //       System.out.println("");
      //     }
      
      



      // -------------------------------------------------------------------------- //
      
      

      //Write a java program to add two matrices named ‘A’ and ‘B’, then store the values in a new 
          // matrix ‘C’ and print it. (Take elements of matrices from the user)

      // Scanner sc = new Scanner(System.in);
      // int[][] matrix1 = new int[2][2];
      // int[][] matrix2 = new int[2][2];
      // int[][] result = new int[matrix1.length][matrix1[0].length];

      // System.out.println("Add values in matrix 1: ");
      // for(int i = 0; i < matrix1.length; i++){
      //   for(int j= 0; j < matrix1[i].length; j++){
      //     System.out.println("for " + i + " " +  j);
      //     matrix1[i][j] = sc.nextInt();
      //   }
      // }

      // System.out.println("Add values in matrix 1: ");
      // for(int i = 0; i < matrix2.length; i++){
      //   for(int j= 0; j < matrix2[i].length; j++){
      //     System.out.println("for " + i + " " +  j);
      //     matrix2[i][j] = sc.nextInt();
      //   }
      // }
      
      // for(int i = 0; i < result.length; i++){
      //   for(int j= 0; j < result[i].length; j++){
      //     result[i][j] = matrix1[i][j] + matrix2[i][j];
      //   }
      // }

      // // print result matrix
      // System.out.println("The result matrix is: ");
      // for(int i = 0; i<result.length; i++){
      //     for(int j= 0; j < result[i].length; j++){
      //       System.out.print(result[i][j] + " ");
      //     }
      //     System.out.println("");
      // }
      
      
      
      // -------------------------------------------------------------------------- //
      
      
      
      
      
      
      //Write a java program to multiply two matrices named ‘A’ and ‘B’, then store the values in a 
      //new matrix ‘C’ and print it.
      
      
      
      
      // -------------------------------------------------------------------------- //
      
      
      
      //Write a java program that takes date and month from the user and prints the day on that 
      //date of the month. (for 2025)

      /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Year is fixed as 2025
        int year = 2025;

        try {
            LocalDate date = LocalDate.of(year, month, day);
            // Get day of week in full (e.g., "Monday")
            // String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println(dayOfWeek);
            // System.out.println("The day on " + day + "/" + month + "/" + year + " is: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date entered.");
        }

        */









      
  }// main
}// class