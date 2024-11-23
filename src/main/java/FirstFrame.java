import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame{
    public Dimension screenSize;
    GUI gui;

    public FirstFrame(GUI gui) {
        this.gui = gui;
        setTitle("TicTacToe");

        getContentPane().setBackground(Color.BLACK);

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height -30);

        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
