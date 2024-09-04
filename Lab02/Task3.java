import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter Operator:");
        char b=s.next().charAt(0);
        System.out.println("Enter second number:");
        int c=s.nextInt();
        switch (b)
        {
            case '+':System.out.println(a+c);
            break;
            case '-':System.out.println(a-c);
            break;
            case '*':System.out.println(a*c);
            break;
            case '/':System.out.println(a/c);
            break;
            default:System.out.println("Are you fool ??? chose right operator !!!");
        }
    }
