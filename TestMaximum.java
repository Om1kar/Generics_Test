package CoreJava;

public class TestMaximum {
    /*
    To test which integer is maximum using java generics
     */
    public static Integer compareTo(Integer a, Integer b, Integer c) {
        /*
        comparing 3 Integers by if-else condition
        return = Maximum Integer
         */
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        else return c;
    }
    public static void main(String[] args) {
        int testMaximum = compareTo(30,70,50);
        System.out.println("Maximum Integer among 3 = "+testMaximum);

    }
}
