import javax.swing.*;
import java.awt.*;

public class FirstFrameLabel extends JLabel {
    public FirstFrameLabel() {
        setSize(1920, 1137);
        IntroTextArea text = new IntroTextArea();
        Button nextFrameButton = new Button();
        setBackground(Color.BLACK);
        setLayout(null);

        add(text);


    }
}
