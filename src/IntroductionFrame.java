import javax.swing.*;
import java.awt.*;

public class IntroductionFrame {
    JFrame iF;
    ContinueButtons exit;

    public IntroductionFrame(JFrame frame) {
        Introduction intro = new Introduction(350, 200);

        exit = new ContinueButtons();

        iF = new JFrame();
        iF.setSize(500, 350);
        iF.setLocationRelativeTo(null);
        iF.setLayout(new BorderLayout());
        iF.add(intro.getIntroduction(), BorderLayout.NORTH);
        iF.add(exit.getContinueButton(), BorderLayout.CENTER);

        ContinueButtons.disposerButton(exit.getContinueButton(), iF, frame);

        iF.setVisible(true);

    }

    public JFrame getIntroductionFrame() {
        return iF;
    }
}
