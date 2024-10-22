import java.util.*;

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
//        int a = 1; int b = 2;
//        System.out.println(a + b);
        String a = "blafasel";
        System.out.println(a.replace("fas", "bla"));
        System.out.println("\"\\\\test//\"");
        double d = 25;
        System.out.println(Math.sqrt(d));

        System.out.println((int) (Math.random() * 21) - 10);
        Random r = new Random();
        System.out.println(r.nextInt(-10, 21));
        System.out.println(Math.PI);

        //        String stri = "blahhalb";
//        System.out.println(getMittlererBuchstabe(stri));

        char[] altesArray = {'a', 'b', 'c'};
        meineMethode(altesArray);
        for (char f : altesArray) {
            System.out.println(f);
        }
        double[] preise = {1.2, 1.8, 1.4, 1.5};
        for (double e : preise) {
            System.out.println(e);
        }
        Arrays.sort(preise);
        for (double f : preise) {
            System.out.println(f);
        }

        preise = Arrays.copyOf(preise, preise.length + 1);
        preise[preise.length - 1] = 1.6;
        System.out.println(preise[preise.length - 1]);

        double[] preises = {1.2, 1.3, 1.4, 1.5, 1.6};
        System.out.println(Arrays.equals(preise, preises));


        int[][] x = {{1, 2}, {3, 4}, {5, 6}};
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length; j++) {
//                System.out.print(x[i][j]);
//            }
//        }
        System.out.println(Arrays.deepToString(x));

//        for (int[] y : x) {
//            for (int z : y) {
//                System.out.print(z);
//            }
//            System.out.println();
//        }

        List<Integer> bla = new ArrayList<>();
        for (int i = 2; i < 20; i += 2) {
            bla.add(i);
        }
        Collections.sort(bla);              // -> DIE LISTE SORTIEREN

        bla.set(2, 100);                    // -> EIN ELEMENT TAUSCHEN
        for (int t : bla) {
            System.out.println(t);
        }

        int zahl = bla.get(0);              // -> EIN ELEMENT FINDEN
        System.out.println(zahl);

        bla.clear();                        // -> ALLE ELEMENTE LÖSCHEN
        System.out.println(bla.isEmpty());

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        int anzahl = 5;
        for (int i = 0; i < anzahl; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
            /*  1
                22
                333
                4444
                55555
             */
            char[][] spielfeld = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};





//        Scanner print = new Scanner(System.in);
//        int anzahlZeilen = print.nextInt();
//        for (int i = 1; i <= anzahlZeilen; i++) {
//            for (int j = i; j < anzahlZeilen; j++) {
//                System.out.print('.');
//            }
//            System.out.println(i);
//        }
        //....1
        //...2
        //..3
        //.4
        //5
        int f = 5;
        sternchenPyramide(f);
        arrayNavigieren(spielfeld);




    }


    public static void sternchenPyramide(int x) {
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
/*  *
    **
    ***
    ***
 */

    public static void arrayNavigieren(char[]) {
        char[][] spielfeld = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j]);
            }
            System.out.println();
        }
    }

    public static String removeTwoChars(String str) {

    }

    public static char[] meineMethode(char[] altesArray) {  // -------------------->
        char[] neuesArray = new char[altesArray.length];
        for (int i = 0; i < altesArray.length; i++) {                               //ARRAY KOPIEREN
            neuesArray[i] = altesArray[i];
        }
        return neuesArray;                                  // -------------------->
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
