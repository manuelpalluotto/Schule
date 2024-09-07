public class Datentypen {
    public static void main(String[] args) {

        short s = 100;
        double d = 10.5;
        boolean b = true;
        char c = 'A';

        double largeNumber = 123.456;
        System.out.println(largeNumber);

        int smallNumber = (int) largeNumber;
        System.out.println(smallNumber);

        double ff = 3.14159;
        int aa = (int) ff;
        System.out.println(ff + "," + aa);

        byte b2 = 127;
        System.out.println(b2);

        long l = 10000000000000000L;
        System.out.println(l);
    }
}
