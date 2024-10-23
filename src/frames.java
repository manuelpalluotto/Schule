import javax.swing.*;
import java.awt.*;

public class frames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menubar = new JMenuBar();
        JPanel spielfeld = new JPanel();
        frame.setTitle("TicTacToe");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        spielfeld.setSize(350, 350);
        spielfeld.add(menubar);

        menubar.setBackground(Color.BLACK);

        frame.add(spielfeld);


        frame.setVisible(true);
    }
}
