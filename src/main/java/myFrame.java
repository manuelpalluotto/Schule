import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class myFrame extends JFrame {
    public JFrame frame;

    public myFrame(String title, int width, int height) {
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);
    }

}
