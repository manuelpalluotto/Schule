import java.util.InputMismatchException;
import java.util.Scanner;

public class javadrei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zwei;
        String uebung;
        int x;

        try {
            System.out.println("Bitte gib hier deinen Text ein: ");
            uebung = scanner.nextLine();
            System.out.println("Deine Eingabe war: " + uebung);
        } catch (InputMismatchException exception) {
            System.out.println("Schnitzer");
        }


        try{
            System.out.println("Gib außerdem noch eine Zahl ein: ");
            x = scanner.nextInt();
            System.out.println("Deine Zahl war: " + (x + 1));
        } catch (InputMismatchException exception) {
            System.out.println("Schnitzer");
        }


        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("lalala");
            zwei = scan.nextLine();
            System.out.println("Ihre Eingabe war: " + zwei);
        } catch (InputMismatchException exception) {
            System.out.println("Schnitzer");
        }
    }
 }
