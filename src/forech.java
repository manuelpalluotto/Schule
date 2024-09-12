public class forech {
    public static void main(String[] args) {

        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        for (String ausgelesen : wochentage) {
            System.out.println(ausgelesen);
        }
        int count = 0;
        int sum = 0;
        int[] kleineZahlen = {1, 2, 3, 4, 5};
        for (int ergebnis : kleineZahlen) {
            sum += ergebnis;
            count++;
            if (count == 5) {
                break;
            //}
        }
        System.out.println(sum);

        String charFinden = "Char finden.";
        //for (String aufgabe : charFinden) {

    }
}


// int[] ursprungsInt = {1, 2, 3, 4, 5}
// for (int neueInt : ursprungsInt){
//      System.out.println(neuent);
// }