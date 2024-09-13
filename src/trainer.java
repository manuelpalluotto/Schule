public class trainer {
    public static void main(String[] args) {

        //int stunde = 14;

        /*  05:00 - 11:00   "Guten Morgen"
            12:00 - 17:00   "Guten Tag"
            18:00 - 22:00   "Guten Abend"
            else            "Gute Nacht"
         */

       /* if (stunde >= 5 && stunde <= 11) {
            System.out.println("Guten Morgen");
        } else if (stunde >= 12 && stunde <= 17) {
            System.out.println("Guten Tag");
        } else if (stunde >= 18 && stunde <= 22) {
            System.out.println("Guten Abend");
        } else {
            System.out.println("Gute Nacht");
        }

        */


        /*int a = 1;
        int b = 2;
        int c = 3;
        wenn "True" wird der wert nach dem Fragezeichen zugewiesen, ansonsten nach doppelpunkt
        int anwesend =

        System.out.println(Math.max(a, Math.max(b, c)));*/


//        int anwesend = 12;
//        boolean darfTeilnehmen;
//        int einheiten = 15;
//        darfTeilnehmen = anwesend >= einheiten * 0.8;
//        System.out.println(darfTeilnehmen);
//        System.out.println(12 * 0.8);
//
//        //>= 3 Jahre sql und java = Profi; 3 Jahre java ODER sql = Fortgeschritten;<=  2 Jahre java UND sql = Anfänger;
//
//        String wissensstand = "Lalala";

//        int[] zahlen;
//        for (int i = 1; i < 4; i++) {
//            System.out.println(i);
//        }
//        char[] altesArray = {'a', 'b', 'c'};
//        char[] neuesArray = new char[altesArray.length];
//        for (int i1 = 0; i1 < altesArray.length; i1++) {
//            neuesArray[i1] = altesArray[i1];
//            System.out.print(neuesArray[i1] + " ");
//        }

//        String[] zimmerpflanzen = {"Orchidee", "Lilie", "Palme"};
//        String meineLieblingspflanze = zimmerpflanzen[1];
//        System.out.println(meineLieblingspflanze);

//        String[] kroepfchen = {"bla", "fasel", "lala"};
//        String[] toepfchen = new String[] {"Schlechte Linse", "Gute Linse", "Sehr gute Linse"};
//        toepfchen[0] = kroepfchen[1];
//        System.out.println(toepfchen[0]);


//        String[] array = {"la", "li", "lu", "lo"};
//        int[] fasel = {1,2,3,4,5,6};
//        fasel = Arrays.copyOf(fasel, fasel.length + 1);
//        fasel[fasel.length - 1] = 7;
//        System.out.println(Arrays.toString(fasel));
//        int[] fasel2 = {1,2,3,4};
//        System.out.println(Arrays.equals(fasel, fasel2));
//
//        int[][] zahlen = {{1,2}, {3,4}, {5,6}};
//        System.out.println(Arrays.deepToString(zahlen));
//
//        List<String> tiere = new ArrayList<>();
//        Collections.addAll(tiere, "schmand", "satze", "maus");
//        Collections.sort(tiere);
//        System.out.println(tiere);

//        String[] saengerArray = {"la", "di", "da"};
//        List<String> saengerList = List.of(saengerArray);
//        System.out.println(saengerList);
//        List<String> saengerList = new ArrayList<>();
//        saengerList.add("la");
//        saengerList.add("di");
//        saengerList.add("da");
//        System.out.println(saengerList);
//        String[] saengerArray;
//        saengerArray = saengerList.toArray(new String[1]);
//        System.out.println(Arrays.toString(saengerArray));

//            int i = 0;
//            while (i < 10 && i % 2 == 0) {
//                i += 2;
//                System.out.println(i);
//            }
//
//            String[] tiere = {"Affe", "Hund", "Katze"};
//            int j = 0;
//            while (j < 3) {
//                System.out.println(tiere[j]);
//                j++;
//            }
//
//
//        int i = 1;
//        while (i <= 10) {
//            i++;
//            if (i % 2 != 0)
//                continue;
//            System.out.println(i);
//        }


//        List<Integer> zahlen = new ArrayList<>();
//        zahlen.add(6);
//        zahlen.add(7);
//        zahlen.add(5);
//        zahlen.add(1);
//        zahlen.add(2);
//        zahlen.remove(0);
//        System.out.println(zahlen.size());
//        int zahl;
//        zahl = zahlen.get(2);
//        System.out.println(zahl);
//        System.out.println(zahlen.toString());

//        String gewinner;
//        Random random = new Random();
//        gewinner = array[random.nextInt(array.length)];
//        System.out.println(gewinner);


//        for (int i1 = 1; i1 < 5; i1 += 1) {
//            System.out.println("Ich bin");
//        }

//        for (int i = 1; i < 201; i++) {
//            if (i % 3 != 0 || i % 16 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//       for (int i = 1; i < 101; i++) {
//           if (i % 4 != 0) {
//            continue;
//           }
//           System.out.println(i);
//       }

//       int[] bla = {1,2,8,3};
//       int max = bla[0];
//        for (int i = 0; i < bla.length; i++) {
//            if(bla[i] > max) {
//                max = bla[i];
//            }
//        }
//        System.out.println(max);


//        for (int i = 1; i < 201; i++) {
//            if (i % 3 != 0 || i % 16 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1900; i < 2100; i++) {
//            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i < 101; i++) {
//            if (i % 4 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 4; i <= 16; i += 3){
//            System.out.print(i + " ");
//        }
//        int anzahlZeilen = 3;
//        char c = '*';
//        for (int i = 0; i < anzahlZeilen; i++) {
//            System.out.print(c);
//            for (int i1 = 0; i1 < 10; i1++) {
//                System.out.print(c);
//            }
//            System.out.println();
//        }


        int anzahlZeilen = 5;
        for (int i = 0; i < anzahlZeilen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }


    }

}
