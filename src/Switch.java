import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        char ergebnis = '1';
        switch (day) {
            case 1:
               // char[0][0] = 'X';
                break;
            case 2:
                ergebnis = 'X';
                break;
            case 3:
                ergebnis = 'X';
                break;
            case 4:
                ergebnis = 'X';
                break;
            case 5:
                ergebnis = 'X';
                break;
            case 6:
                ergebnis = 'X';
                break;
            case 7:
                ergebnis = 'X';
                break;
        }
        System.out.println(ergebnis);

//        String fruit = "";
//        switch (fruit) {
//            case "Apfel":
//                fruit = "Apfel";
//                break;
//            case "Banane":
//                fruit = "Banane";
//                break;
//            case "Kirsche":
//                fruit = "Kirsche";
//                break;
//            default:
//                fruit = "Unbekannte Frucht";
//
//        }
//        System.out.println(fruit);
//
//        int month = 3;
//        String monthString = "";
//
//        switch (monthString) {
//            case "Januar":
//                monthString = "Januar";
//                break;
//            case "Februar":
//                monthString = "Februar";
//                break;
//            case "März":
//                monthString = "März";
//                break;
//            case "April":
//                monthString = "April";
//                break;
//            default:
//                monthString = "Unbekannter Monat";
//        }
//        System.out.println(monthString);


    }
}
