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
        char[][] spielfeld = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        int alter = 22;
        String name = "Max";
        int x = 3;
        int a = 6;
        int b = 7;
        int c = 5;
        sternchenVersetzt(x);
        zahlenPyramideGleichVieleZeilenWieZahl(x);
        sternchenPyramide(x);
        abcSpielfeld(spielfeld);
        bitteVorstellen(name, alter);
        System.out.println(toUpperOrLowerCase(name));
        System.out.println(gleichVieleXundY("aaa"));
        System.out.println(isPrimzahl(x));


    }

    public static void bitteVorstellen(String name, int alter) {
        System.out.println(String.format("Mein Name ist %s und ich bin %d Jahre alt. Nach meinem Geburtstag bin ich %d.", name, alter, alter + 1));

    }

    public static void abcSpielfeld(char[][] spielfeld) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int zollNachFuss(int zoll) {
        return zoll / 12;
    }

    public static String toUpperOrLowerCase(String meinString) {
        return meinString.length() % 2 == 0 ? meinString.toLowerCase() : meinString.toUpperCase();
    }

    public static boolean isOldEnough(int alterInJahren) {
        return alterInJahren < 18 ? false : true;
    }

    public static double minutenNachSekunden(int minuten) {
        return minuten * 60;
    }

    public static void sternchenVersetzt(int anzahlZeilen) {
        for (int i = 0; i < anzahlZeilen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }

    public static void zahlenPyramideGleichVieleZeilenWieZahl(int anzahlZeilen) {
        for (int i = 1; i <= anzahlZeilen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void sternchenPyramide(int anzahlZeilen) {
        for (int i = 1; i <= anzahlZeilen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static boolean gleichVieleXundY(String str) {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                countY++;
                continue;
            }
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
                continue;
            }
        }
        return countX == countY ? true : false;
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

    public static boolean isPrimzahl(int zahl) {
        for (int i = 2; i < zahl / 2; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
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
