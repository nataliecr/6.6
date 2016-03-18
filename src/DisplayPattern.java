import java.util.Scanner;

public class DisplayPattern {
  public static void displayPattern(int n){
    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= n - i; j++){
         int num = 0;
         int temp = n - (j - 1);
         while(temp != 0){
           num++;
           temp = temp / 10;
         } // while
         for (int k = -1; k < num; k++)
          System.out.print(" ");
      } // for j
      for (int j = i; j >= 1; j--)
        System.out.print(j + " ");
      System.out.println();
    } // for i 
  }  // displayPattern
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = input.nextInt();
    displayPattern(n);  
  } // main
} // DisplayPattern
