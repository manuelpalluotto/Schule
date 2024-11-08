import javax.swing.*;
import java.awt.*;

public class ContinueButtons extends JButton{
    private JButton cB;

    public ContinueButtons() {
        cB = new JButton("Continue");
        cB.setBackground(Color.white);
        cB.setVisible(true);

    }

    public static JButton disposerButton(JButton cB, JFrame disposedFrame, JFrame nextFrame) {
        cB.addActionListener(e -> {
            disposedFrame.dispose();
            nextFrame.setVisible(true);
        });
        return cB;
    }

    public JButton getContinueButton() {
        return cB;
    }

}
