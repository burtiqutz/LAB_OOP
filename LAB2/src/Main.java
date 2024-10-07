import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String s1;
        String s2 = "42";
        int i1 = 10;
        int i2 = 0;

        s1 = Integer.toString(i1);
        try{
            i2 = Integer.parseInt(s2);
        }catch(Exception e){
            System.out.println("Am prins exceptia");
        }

        System.out.println(s1);
        System.out.println(i2);
        short test1 = Short.MAX_VALUE;
        test1++;
        System.out.println(test1);
        int test2 = Integer.MAX_VALUE;
        test2++;
        System.out.println(test2);
        long test3 = Long.MAX_VALUE;
        test3++;
        System.out.println(test3);

        short test4 = Short.MIN_VALUE;
        test4--;
        System.out.println(test4);
        int test5 = Integer.MIN_VALUE;
        test5--;
        System.out.println(test5);
        long test6 = Long.MIN_VALUE;
        test6--;
        System.out.println(test6);

        double test7 = Double.MAX_VALUE;
        test7 *= 1.2;
        System.out.println(test7);
        double test72 = Double.MAX_VALUE;
        test72 /= test7;
        System.out.println(test7);

        BigInteger test8 = new BigInteger("2147483648");
        BigInteger sum = test8.add(new BigInteger("1"));

        System.out.println(sum);

        float test9 = 0.1234567890123456789f;
        float test10 = 0.9876543210987654321f;

        double test11 = test9 + test10;
        double test12 = test10 - test9;
        System.out.println("Suma " + test11);
        System.out.println("Diferenta " + test12);

    }
}
