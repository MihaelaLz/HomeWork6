import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter your number:");
        int num;
        Scanner scanner=new Scanner(System.in);
        num = scanner.nextInt();


        System.out.println("The number is:");
        System.out.println((num % 2 == 0 && num % 2 >= 0) ? "Even" : "Odd");



    }
}
