import javax.swing.*;
import java.awt.*;

public class FirstFrameLabel extends JLabel {

    Button nextFrameButton;


    public FirstFrameLabel() {
        setSize(1920, 1137);
        IntroTextArea text = new IntroTextArea();
        nextFrameButton = new Button();
        nextFrameButton.disposerButton(getWhereIntroductionIsShown, nextFrameButton, getWhereUserCanInput);
        setBackground(Color.BLACK);
        setLayout(null);
        add(nextFrameButton);
        add(text);


    }
}
