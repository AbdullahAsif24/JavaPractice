
public class PaperPractice {
  public static void main(String[] args) {

    // finding common elements in arrays and store in another array
    int[] arr1 = { 15, 28, 7, 63, 42 };
    int[] arr2 = { 91, 67, 15, 31, 53 };

    int[] resultArr = new int[1];

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]) {
          resultArr = new int[]{arr1[i]};
          break;
        }
      }
    }
    System.out.println("Comment number is " + resultArr[0]);

    // ---------------------------------------------------------------------------------- //

     // Q1. An integer number 2025 is given. You are required to find a number between 21 and 25 (inclusive) such that when 2025 is divided by that number, the remainder is 0.
     // Write a Java program to find and display the correct number.
      for(int i = 21; i <= 25; i++){
        if(2025 % i == 0){
          System.out.println("The number is " + i);
          break;
        }
      }

      // ------------------------------------- //



  }// main
}// class