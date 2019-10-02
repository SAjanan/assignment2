package assignment2;
import java.util.Scanner;

public class q18 {
	
	
	   public static void main(String args[])
	   {
	      int m, n, a, b;
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter the number of rows and columns of matrix : ");
	      m = in.nextInt();
	      n  = in.nextInt();
	     
	      int first[][] = new int[m][n];
	      int second[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	     
	      System.out.println("Enter the elements of first matrix :");
	     
	      for (a = 0; a < m; a++)
	         for (b = 0; b < n; b++)
	            first[a][b] = in.nextInt();
	           
	      System.out.println("Enter the elements of second matrix :");
	     
	      for (a = 0 ; a < m ; a++)
	         for (b = 0 ; b < n ; b++)
	            second[a][b] = in.nextInt();
	           
	      for (a = 0; a < m; a++)
	         for (b = 0; b < n; b++)
	             sum[a][b] = first[a][b] + second[a][b];
	 
	      System.out.println("Sum of the matrices  :");
	     
	      for (a = 0; a < m; a++)
	      {
	         for (b = 0; b < n; b++)
	            System.out.print(sum[a][b]+"\t");
	         
	         System.out.println();
	      }
	   }
	}
