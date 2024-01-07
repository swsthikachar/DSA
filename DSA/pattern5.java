import java.util.Scanner;
public class pattern5 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=n-1;i>=0;i--)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
             for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        nStarTriangle(n);
        sc.close();
    }
}