import java.util.Scanner;
        public class Task5{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
                System.out.println("Enter the Hight :");
        int n=S.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++) {
                System.out.print("*"+ " ");
            }
            System.out.println(" ");
        }
    }
        }
