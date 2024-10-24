
import javax.swing.*;
import java.awt.*;
public class GUI {
    public GUI() {
        // JFrame erstellen
        JFrame frame = new JFrame();
        frame.setTitle("TicTacToe");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // ImageIcon laden
        ImageIcon spielfeld = new ImageIcon("/home/manuelpalluotto/Dokumente/tic-tac-toe-1954446_1920.jpg");

        // JLabel mit dem Bild erstellen
        JLabel label = new JLabel(spielfeld);
        label.setSize(500, 350);

        // JPanel erstellen und das JLabel hinzufügen
        JPanel panel1 = new JPanel();
        panel1.add(label);
        panel1.setSize(400, 250);
        panel1.setBackground(Color.BLACK);

        // JPanel zum JFrame hinzufügen
        frame.add(panel1);




    }








    public static void main(String[] args) {
        new GUI();
    }
}


