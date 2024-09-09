public class Switch {
    public static void main(String[] args) {
        int day = 2;
        String ergebnis = "";
        switch (day) {
            case 1:
                ergebnis = "Montag";
            case 2:
                ergebnis = "Dienstag";
                break;
            case 3:
                ergebnis = "Mittwoch";
                break;
            case 4:
                ergebnis = "Donnerstag";
                break;
            case 5:
                ergebnis = "Freitag";
                break;
            case 6:
                ergebnis = "Samstag";
                break;
            case 7:
                ergebnis = "Sonntag";
                break;
        }
        System.out.println(ergebnis);

        String fruit = "";
        switch (fruit) {
            case "Apfel":
                fruit = "Apfel";
                break;
            case "Banane":
                fruit = "Banane";
                break;
            case "Kirsche":
                fruit = "Kirsche";
                break;
            default:
                fruit = "Unbekannte Frucht";

        }
        System.out.println(fruit);

        int month = 3;
        String monthString = "";

        switch (monthString) {
            case "Januar":
                monthString = "Januar";
                break;
            case "Februar":
                monthString = "Februar";
                break;
            case "März":
                monthString = "März";
                break;
            case "April":
                monthString = "April";
                break;
            default:
                monthString = "Unbekannter Monat";
        }
        System.out.println(monthString);


    }
}
