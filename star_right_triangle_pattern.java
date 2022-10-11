//Java program to print a right triangle star pattern
import java.util.Scanner; 
class Main 
{
  public static void main(String[] args) {
     System.out.printf("Enter the number of rows of the triangle to be entered : ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    for (int i = 0; i < n; i++) 
    {
        for (int j = 0; j <= i; j++) {
        System.out.printf("*");
     }
      System.out.println();
    }
  }
}
