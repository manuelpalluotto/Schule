public class Vergleich {

    public static void main(String[] args) {

        int num = 15;
        int x = 15;
        boolean isSunny = true;
        int a = 1;
        int b = 2;

        if (num > 10 && num < 20) {
            System.out.println("innerhalb des Bereichs");
        } else {
            System.out.println("false");
        }

        if (x < 5 || x > 15) {
            System.out.println("Außerhalb des Bereich");
        } else {
            System.out.println("false");
        }

        if (isSunny) {
            System.out.println("Es ist sonnig.");
        } else {
            System.out.println("Es ist nicht sonnig");
        }

        if (a == 1 ^ b == 1) {
            System.out.println("Exklusives Oder trifft zu");
        } else {
            System.out.println("Exklusives Oder trifft nicht zu");
        }

    }

}