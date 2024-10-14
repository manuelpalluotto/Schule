import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char[][] playingField = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        //Das Array wird deklariert und initialisiert und dient uns als Spielfeld

        System.out.println("Willkommen Spieler 1, bitte geben Sie Ihren Namen ein:");
        String namePlayer1 = playerName();

        System.out.println("Willkommen Spieler 2, bitte geben sie Ihren Namen ein:");
        String namePlayer2 = playerName();
        //Die Methode für Namenseingabe wird aufgerufen

        introduction();
        //Ein Einleitungstext wird abgerufen


        drawingThePlayingField(playingField);
        //Mittels einer for-Schleife wird hier durch das Array iteriert und das Spielfeld wird ausgegeben


        while (true) {
            if (gewinner(playingField, 'o', namePlayer2)) {
                break;
                //In der aufgerufenen Methode wird hier überpfrüft ob der vorherige Spielzug
                //bereits gewonnnen hat
            }
            tokenPlayer(playingField, namePlayer1, 'x');
            outputAfterToken(playingField);
            if (unentschieden(playingField)) {
                break;
            }
            if (gewinner(playingField, 'x', namePlayer1)) {
                break;
            }
            //In der aufgerufenen Methode wird hier überpfrüft ob der vorherige Spielzug
            //bereits gewonnnen hat
            tokenPlayer(playingField, namePlayer2, 'o');
            outputAfterToken(playingField);
            if (unentschieden(playingField)) {
                break;
            }

        }

    }

    public static boolean unentschieden(char[][] playingField) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean belegt = (playingField[i][j] == 'x') || (playingField[i][j] == 'o');
                if (!belegt) {
                    return false;
                }
            }
        }
        System.out.println("Unentschieden!");
        return true;
    }


    public static String playerName() {
        Scanner scanner1 = new Scanner(System.in);
        String namePlayer = scanner1.nextLine();
        return namePlayer;
    }

    public static void introduction() {
        System.out.println();
        System.out.println("Viel Spaß beim nachfolgenden Spiel Tic Tac Toe. Falls du die Regeln nicht kennst, hier einmal erklärt: " + "Jeder Spieler darf nacheinander einen Stein setzen, entweder ein 'X' oder ein 'O'." + "\n" + "Der Spieler, der zuerst" + " drei Steine in eine Reihe, senkrecht oder waagrecht, setzen kann hat gewonnen!" + "\n" + "In diesem speziellen Fall musst du allerdings" + " die Zahl angeben, an dessen Stelle du deinen Stein setzen willst. Viel Spaß!");
        System.out.println();
        Scanner enter = new Scanner(System.in);
        System.out.println("Um fortzufahren, drücke die ENTER Taste.");
        String weiter = enter.nextLine();

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


    public static boolean gewinner(char[][] playingField, char c, String s) {                            //GEWINNER von c
        for (int i = 0; i < 3; i++) {
            if ((playingField[i][0] == c && playingField[i][1] == c && playingField[i][2] == c) || (playingField[0][i] == c && playingField[1][i] == c && playingField[2][i] == c)) {
                System.out.println("Gewinner: " + s);
                return true;

            }
        }
        if ((playingField[0][0] == c && playingField[1][1] == c && playingField[2][2] == c) ||
                (playingField[2][0] == c && playingField[1][1] == c && playingField[0][2] == c)) {
            System.out.println("Der Gewinner ist " + s);
            return true;
        }
        return false;

    }

    public static void tokenPlayer(char[][] playingField, String namePlayer, char c) {
        boolean isLoop = true;
        while (isLoop) {
            int intScan;
            System.out.println(namePlayer + ", bitte setzte deinen Spielstein \"" + c + "\" auf eine Nummer:");
            try {
                Scanner scan = new Scanner(System.in);
                intScan = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(mismatchError());
                outputAfterToken(playingField);
                continue;
            }
            if (intScan < 1 || intScan > 9) {
                System.out.println(intError());
                outputAfterToken(playingField);
                continue;
            }
            if (validatePlayerChangeAndSetTurn(c, intScan, playingField)) {
                System.out.println("Falsche Eingabe");

            } else {
                isLoop = false;
            }
        }
    }

    public static void outputAfterToken(char[][] playingField) {
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[i].length; j++) {
                System.out.print("\t" + playingField[i][j] + "\t");
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

    public static boolean validatePlayerChangeAndSetTurn(char player, int userInput, char[][] playingField) {
        switch (userInput) {
            case 1:
                if (playingField[0][0] == 'x' || playingField[0][0] == 'o') {
                    return true;
                } else {
                    playingField[0][0] = player;
                    return false;
                }
            case 2:
                if (playingField[0][1] == 'x' || playingField[0][1] == 'o') {
                    return true;
                } else {
                    playingField[0][1] = player;
                    return false;
                }
            case 3:
                if (playingField[0][2] == 'x' || playingField[0][2] == 'o') {
                    return true;
                } else {
                    playingField[0][2] = player;
                    return false;
                }
            case 4:
                if (playingField[1][0] == 'x' || playingField[1][0] == 'o') {
                    return true;
                } else {
                    playingField[1][0] = player;
                    return false;
                }
            case 5:
                if (playingField[1][1] == 'x' || playingField[1][1] == 'o') {
                    return true;
                } else {
                    playingField[1][1] = player;
                    return false;
                }
            case 6:
                if (playingField[1][2] == 'x' || playingField[1][2] == 'o') {
                    return true;
                } else {
                    playingField[1][2] = player;
                    return false;
                }
            case 7:
                if (playingField[2][0] == 'x' || playingField[2][0] == 'o') {
                    return true;
                } else {
                    playingField[2][0] = player;
                    return false;
                }
            case 8:
                if (playingField[2][1] == 'x' || playingField[2][1] == 'o') {
                    return true;
                } else {
                    playingField[2][1] = player;
                    return false;
                }
            case 9:
                if (playingField[2][2] == 'x' || playingField[2][2] == 'o') {
                    return true;
                } else {
                    playingField[2][2] = player;
                    return false;
                }
        }
        return false;
    }
}


