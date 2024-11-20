import javax.swing.*;
import java.awt.*;

public class LoginFramePanel extends JPanel {
     GUI gui;
     Button nextFrameButton;

    public LoginFramePanel(GUI gui) {
        this.gui = gui;
        setSize(1920, 1080);
        setLayout(null);

        nextFrameButton = new Button();
        nextFrameButton.setText("Next");
        nextFrameButton.setBounds(800,400, 100, 50);
        add(nextFrameButton);
        nextFrameButton.addActionListener(e -> {
           gui.whereUserCanInput.dispose();
           gui.whereTheGridIsShown.setVisible(true);
        });

        setVisible(true);
    }


    public JPanel getLoginFramePanel() {
        return this;
    }
}