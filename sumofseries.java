import java.util.Scanner;
public class sumofseries {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        int n, sum=0, i=0;
        System.out.println("Enter the range of number: ");
        n=cs.nextInt();
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of the series= "+sum);
        cs.close();
    }
}