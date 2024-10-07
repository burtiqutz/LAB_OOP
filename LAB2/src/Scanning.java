import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        String test;
        Scanner input = new Scanner(System.in);

        int a;
        float b;
        System.out.println("Enter an integer: ");
        a = input.nextInt();
        System.out.println("Enter a float: ");
        b = input.nextFloat();

        System.out.println("Integer: " + a + " Float: " + b);
        
    }
}
