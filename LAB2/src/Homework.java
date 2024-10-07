import java.math.BigInteger;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        int n = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger temp = new BigInteger("2");
            temp = temp.pow(i);
            sum = sum.add(temp);
        }

        System.out.println(sum);
    }
}
