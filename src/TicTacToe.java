import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
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

//        boolean isOver;
        while (true) {
            tokenPlayer1(playingField, namePlayer1);
            outputAfterToken(playingField);

            tokenPlayer2(playingField, namePlayer2);
            outputAfterToken(playingField);
        }

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

    public static void tokenPlayer1(char[][] playingField, String nameSpieler1) {
        System.out.println(nameSpieler1 + ", bitte setzte deinen Spielstein \"x\" auf eine Nummer:");
        Scanner scanPlayer1 = new Scanner(System.in);
        try {
            int userInput = scanPlayer1.nextInt();
            System.out.println();
            if (userInput < 1 || userInput > 9) {
                while (userInput < 1 || userInput > 9) {
                    System.out.println("Bitte nur Zahlen zwischen 1 und 9!");
                    Scanner scan = new Scanner(System.in);
                    userInput = scan.nextInt();
                    turn('x', userInput, playingField);
                }
            } else {
                turn('x', userInput, playingField);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Bitte nur eine ZAHL von 1 bis 9!");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            turn('x', userInput, playingField);
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


    public static void tokenPlayer2(char[][] playingField, String nameSpieler2) {
        Scanner scanPlayer2 = new Scanner(System.in);
        System.out.println(nameSpieler2 + ", bitte setzte deinen Spielstein \"o\" auf eine Nummer:");
        try {
            int userInput = scanPlayer2.nextInt();
            System.out.println();
            if (userInput < 1 || userInput > 9) {
                while (userInput < 1 || userInput > 9) {
                    System.out.println("Bitte nur Zahlen zwischen 1 und 9!");
                    Scanner scan = new Scanner(System.in);
                    userInput = scan.nextInt();
                    turn('o', userInput, playingField);
                }
            } else {
                turn('o', userInput, playingField);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Bitte nur eine ZAHL von 1 bis 9!");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            turn('o', userInput, playingField);

        }
    }


//    public static String gewinner(char[][] playingField, String player1, String player2) {
//        if (playingField[0][0] == 'x' && playingField[1][1] == 'x' && playingField[2][2] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[0][0] == 'o' && playingField[1][1] == 'o' && playingField[2][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[2][0] == 'x' && playingField[1][1] == 'x' && playingField[0][2] == 'x') {
//            System.out.println(("Gewinner: " + player1));
//            return player1;
//        } else if (playingField[2][0] == 'o' && playingField[1][1] == 'o' && playingField[0][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[0][0] == 'x' && playingField[0][1] == 'x' && playingField[0][2] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[0][0] == 'o' && playingField[0][1] == 'o' && playingField[0][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[1][0] == 'x' && playingField[1][1] == 'x' && playingField[1][2] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[1][0] == 'o' && playingField[1][1] == 'o' && playingField[1][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[2][0] == 'x' && playingField[2][1] == 'x' && playingField[2][2] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[2][0] == 'o' && playingField[2][1] == 'o' && playingField[2][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[0][0] == 'x' && playingField[1][0] == 'x' && playingField[2][0] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[0][0] == 'o' && playingField[1][0] == 'o' && playingField[2][0] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[0][1] == 'x' && playingField[1][1] == 'x' && playingField[2][1] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[0][1] == 'o' && playingField[1][1] == 'o' && playingField[2][1] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        } else if (playingField[0][2] == 'x' && playingField[1][2] == 'x' && playingField[2][2] == 'x') {
//            System.out.println("Gewinner: " + player1);
//            return player1;
//        } else if (playingField[0][2] == 'o' && playingField[1][2] == 'o' && playingField[2][2] == 'o') {
//            System.out.println("Gewinner: " + player2);
//            return player2;
//        }
//        return "unentschieden!";
//    }


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
