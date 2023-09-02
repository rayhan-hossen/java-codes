public class fibonacci {
    public static void main(String[]args){
        int n=10, num1=0, num2=1;
        System.out.println("Fibonacci series till"+n+"num: ");
        for (int i=1; i<=n; ++i){
            System.out.println(num1+", ");

            int nextNum=num1 + num2;
            num1=num2;
            num2=nextNum;
        }
    }
}