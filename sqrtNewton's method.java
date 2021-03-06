import java.util.Scanner;

public class SqrtNewtonMethod {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();

        double epsilon = 1e-15;    
        double t = c;              

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        
        // print out the estimate of the square root of c
        System.out.println(t);
    
    }
    
}