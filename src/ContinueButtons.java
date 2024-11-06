import javax.swing.*;
import java.awt.*;

public class ContinueButtons {
    private JButton cB;

    public ContinueButtons(int x, int y, int width, int height) {
        cB = new JButton("Continue");
        cB.setSize(width, height);
        cB.setBackground(Color.white);
        cB.setVisible(true);
        cB.setBounds(x, y, width, height);

    }

    public JButton getContinueButton() {
        return cB;
    }

    public static JButton disposerButton(JButton cB, JFrame disposedFrame, JFrame nextFrame) {
        cB.addActionListener(e -> {
            disposedFrame.dispose();
            nextFrame.setVisible(true);
        });
        return cB;
    }

}
