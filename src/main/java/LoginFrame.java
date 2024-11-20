import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private Dimension screenSize;
    LoginFramePanel panel;
    GUI gui;

    public LoginFrame() {
        this.gui = gui;
        setLayout(new BorderLayout());
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height -30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new LoginFramePanel(gui);

        add(panel, BorderLayout.CENTER);
        setVisible(false);


    }
}
