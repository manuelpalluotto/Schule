import java.util.ArrayList;
import java.util.List;

public class Notizen {
    public static void main(String[] args) {
        // %s für Platzhalter String
        // %d für Platzhalter int
        // Beispiel: String.format("Mein Name ist %s und ich bin %d Jahre alt. Nach meinem Geburtstag bin ich
        //              %d.", name, alter, alter + 1);


//        String meinString = "viers";
//        System.out.println(toUpperOrLowerCase(meinString));
//        int alterInJahren = 17;
//        System.out.println(isOldEnough(alterInJahren));
//        System.out.println(minutenNachSekunden(3));
//        String str = "amahay";
//        System.out.println(gleichVieleXundY(str));
//        String vorname = "Max";
//        String nachname = "Fustermann";
//        System.out.println(berechneInitialien(vorname, nachname));
//        System.out.println(kehreStringUm(nachname));
//        String strng = "Text";
//        System.out.println(baueWortPyramide(strng));
//        ArrayList<Integer> innt = new ArrayList<Integer>();
//        innt.add(1);
//        innt.add(2);
//        innt.add(3);
//        innt.add(4);
//        innt.add(15);
//        System.out.println(getPrimzahlenVon(2, 20));
//        int a = 1;
//        int b = 10;
//        int c = 9;
//        System.out.println(berechneDurchschnitt(a, b, c));
//        String stri = "blahhalb";
//        System.out.println(getMittlererBuchstabe(stri));
//          System.out.println(isAufeinanderfolgend(1, 3, 2));
        int a = 1; int b = 2;
        System.out.println(a + b);
    }

    public static String toUpperOrLowerCase(String meinString) {
        if (meinString.length() % 2 == 0) {
            return meinString.toLowerCase();
        }
        if (meinString.length() % 2 != 0) {
            return meinString.toUpperCase();
        } else {
            return meinString;
        }
    }

    public static boolean isOldEnough(int alterInJahren) {

        boolean volljährig = alterInJahren < 18 ? false : true;
        return volljährig;
    }

    public static double minutenNachSekunden(int minuten) {
        minuten *= 60;
        return minuten;
    }

    public static boolean gleichVieleXundY(String str) {
        int countX = 0;
        int countY = 0;
        boolean bool = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                countY++;
            }
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
            }
        }
        if (countY == countX) {
            bool = true;
        } else if (countY != countX) {
            bool = false;
        } else if (countY == 0 && countX == 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public static String berechneInitialien(String vorname, String nachname) {
        char erster = vorname.charAt(0);
        char zweiter = nachname.charAt(0);
        String ergebnis = String.valueOf(erster) + String.valueOf(zweiter);
        return ergebnis;
    }

    public static String kehreStringUm(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String baueWortPyramide(String str) {
        String ausgabe = "";
        for (int i = 0; i < str.length(); i++) {
            String teilstring = "";
            for (int j = 0; j <= i; j++) {
                teilstring += str.charAt(j);
            }
            ausgabe += teilstring + "\n";
        }
        return ausgabe;
    }

    public static double berechneDurchschnitt(int a, int b, int c) {
        int[] ergebnis = {a, b, c};
        int sum = 0;
        for (int i = 0; i < ergebnis.length; i++) {
            sum += ergebnis[i];
        }
        return (double) sum / ergebnis.length;
    }


    public static List<Integer> getPrimzahlenVon(int beginn, int ende) {
        ArrayList<Integer> primzahlen = new ArrayList<>();
        for (int i = beginn; i <= ende; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                primzahlen.add(i);
            }
        }
        return primzahlen;
    }

    public static String getMittlererBuchstabe(String str) {
        String middle = "";
        if (str.length() % 2 == 0) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        } else {
            return str.substring((str.length() / 2), (str.length() / 2) + 1);
        }
    }

    public static boolean isAufeinanderfolgend(int a, int b, int c) {
        int[] zahlenReihenfolge = {a, b, c};
        boolean istAufeinanderfolgend = true;
        for (int i = 0; i < zahlenReihenfolge.length; i++) {
            for (int j = 1; j < i; j++) {
                if (j == i + 1 || j == i - 1) {
                    istAufeinanderfolgend = true;
                } else {
                    istAufeinanderfolgend = false;
                }
            }
        }
        return istAufeinanderfolgend;
    }


}












/*   i = 2 und j = 2
=> i / 2
= 2 / 2 = 1
 => j ist nicht kleiner als i / 2

 i = 3 => i/2=1.5 => j nicht kleiner als i/2

 i=4 => i/2<=2 =>

 */

// beginn >= 2
// ende >= beginn
