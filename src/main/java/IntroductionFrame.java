import javax.swing.*;
import java.awt.*;

public class IntroductionFrame extends JFrame {
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
        iF.add(exit, BorderLayout.CENTER);

        exit.disposerButton(exit, iF, frame);

        iF.setVisible(true);

    }
}


