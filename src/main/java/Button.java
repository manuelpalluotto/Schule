import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button() {
        setText("Continue");
        setForeground(Color.GREEN);
        setBackground(Color.BLACK);
        setBounds(910, 550, 100, 35);
        setVisible(true);
    }

    public static void fromFirstFrametoLoginFrameButton(FirstFrame frame, Button button, LoginFrame loginFrame) {
        button.addActionListener(e -> {
                frame.dispose();
                loginFrame.setVisible(true);
                loginFrame.requestFocus();
        });
    }
}
