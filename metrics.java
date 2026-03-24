import java.util.*;
  2 class main{
  3     public static void main(String args[])
  4     {
  5         Scanner sc= new Scanner(System.in);
  6         System.out.println("enter number of rows:");
  7         int n=sc.nextInt();
  8         for(int i=0;i<n;i++)
  9         {
 10             for(int j=0;j<=i;j++)
 11             {
 12                 System.out.print("*");
 13             }
 14             System.out.println();
 15         }
 16     }
 17 }
