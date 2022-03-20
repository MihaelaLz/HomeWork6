import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter your number:");
        double num;
        Scanner scanner=new Scanner(System.in);
        num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("The result is:");
        System.out.printf("%.5f",(result));


    }
}
