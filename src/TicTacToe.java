import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] playingField = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        //Das Array wird deklariert und initialisiert und dient uns als Spielfeld

        introduction();
        //Die Methode für die Namenseingabe und die Anleitung wird aufgerufen

        drawingThePlayingField(playingField);
        //Mittels einer for-Schleife wird hier durch das Array iteriert und das Spielfeld wird ausgegeben

        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();
        char c1 = (char) input1;
        for (int x = 0; x < playingField.length; x++) {
            for (int y = 0; y < playingField[x].length; y++) {
                if (input1 == 'X' || input1 == 'O') {
                    System.out.println("Dieses Feld wurde bereits belegt, nächster Spieler ist nun an der Reihe!");
                    continue;
                }
                if (playingField[x][y] == c1) {
                    playingField[x][y] = 'X';
                    System.out.print("\t" + playingField[x][y] + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }


        //   Scanner scanner2 = new Scanner(System.in);


        //   userInput();


//        public static void userInput() {
//
//
//        }
//
//
    }

    public static void introduction() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Willkommen!" + "\n" + "Spieler 1, bitte geben Sie Ihren Namen ein:");
        String namenEingabeSpieler1 = scanner1.nextLine();
        System.out.println("Verstanden, willkommen " + namenEingabeSpieler1 + "!" + "\n" + "Spieler 2, bitte geben Sie Ihren Namen ein!");
        String namenEingabeSpieler2 = scanner2.nextLine();
        System.out.println("Verstanden, willkommen " + namenEingabeSpieler2 + "!");
        System.out.println("Viel Spaß beim nachfolgenden Spiel Tic Tac Toe. Falls du die Regeln nicht kennst, hier einmal erklärt: "
                + "Jeder Spieler darf nacheinander einen Stein setzen, entweder ein 'X' oder ein 'O'." + "\n" + "Der Spieler, der zuerst"
                + " drei Steine in eine Reihe, senkrecht oder waagrecht, setzen kann hat gewonnen!" + "\n" + "In diesem speziellen Fall musst du allerdings"
                + " die Zahl angeben, an dessen Stelle du deinen Stein setzen willst. Viel Spaß!");

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
}
