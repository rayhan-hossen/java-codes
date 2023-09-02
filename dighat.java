import java.util.Scanner;
public class dighat {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a= input.nextDouble();
        System.out.println("Enter the value of b:");
        double b= input.nextDouble();
        System.out.println("Enter the value of c:");
        double c= input.nextDouble();
        double d= b*b - 4.0 *a*c;

        if (d>0.0){
            double x1= (-b+Math.pow(d, 0.5))/(2.0*a);
            double x2= (-b-Math.pow(d, 0.5))/(2.0*a);
            System.out.println("The roots are"+x1+ "and"+x2);
        } else if (d==0.0) {
            double x1= -b/(2.0*a);
            System.out.println("The root is"+x1);

        }
          else {
            System.out.println("roots are not real");
        }

    }
}