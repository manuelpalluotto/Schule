import java.util.InputMismatchException;
import java.util.Scanner;

public class tttmthd {
    public static void main(String[] args) {

        char[][] playingField = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

        drawingThePlayingField(playingField);
        //Spielfeld wird angezeigt

        Scanner scan = new Scanner(System.in);
        int intScan = scan.nextInt();
        //An dieser Stelle Usereingabe

        boolean cancelTurn = true;
    }


    public static void drawingThePlayingField(char[][] playingField) {
        System.out.println("\n" + "-----------------");
        System.out.println("\n" + "Hier ist nun dein Spielfeld!" + "\n");
        for (int x = 0; x < playingField.length; x++) {
            for (int y = 0; y < playingField[x].length; y++) {
                System.out.print("\t" + playingField[x][y] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static String mismatchError() {
        return "Fehler: Bitte keine Buchstaben eingeben.";
    }

    public static String intError() {
        return "Fehler: Bitte nur Zahlen zwischen 1 und 9 eingeben.";

    }


    public static void turn(char player, int userInput, char[][] playingField) {
        switch (userInput) {
            case 1:
                playingField[0][0] = player;
                break;
            case 2:
                playingField[0][1] = player;
                break;
            case 3:
                playingField[0][2] = player;
                break;
            case 4:
                playingField[1][0] = player;
                break;
            case 5:
                playingField[1][1] = player;
                break;
            case 6:
                playingField[1][2] = player;
                break;
            case 7:
                playingField[2][0] = player;
                break;
            case 8:
                playingField[2][1] = player;
                break;
            case 9:
                playingField[2][2] = player;
                break;
        }
    }
}
