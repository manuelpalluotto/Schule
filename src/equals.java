public class equals {
    public static void main(String[] args) {

        /* x/3 ohne rest = Fizz
        x/5 ohne rest = Buzz
        x/3 && x/5 ohne rest = FizzBuzz
         */

        double preis = 10;
        int anzahlArtikel = 9;
        // int = 10 10% - int = 20 50% --> Gesamtpreis?

        if (anzahlArtikel >= 10 && anzahlArtikel < 20) {
            preis *= 0.9;
        } else if (anzahlArtikel >= 20) {
            preis *= 0.5;
        }
        System.out.println(preis);
    }
}
