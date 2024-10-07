public class TesteAritmetica {
    public static void main(String[] args){
        int test1 = 5;

        try{
            System.out.println(test1 / 0); // doesn't work
        }catch(ArithmeticException e){
            System.out.println("Eroare");
        }

        float f1 = -0.2341f;
        float f2 = 0.1235f;
        System.out.println(f1 / 0.f);//-infinity
        System.out.println(f2 / 0.f);//infinity
        float f3 = (-f1) / 0.f;
        float f4 = f2 / 0.f;
        System.out.println(Float.POSITIVE_INFINITY * Float.NEGATIVE_INFINITY);
        System.out.println(f3 - f4);
        System.out.println((-f3) * f4);
        boolean b1;
        //b1 = 25;//nu merge
//        int i1 = 33.1f; // nu merge
//        System.out.println(i1);
    }
}
