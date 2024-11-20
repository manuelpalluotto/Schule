import javax.swing.*;
import java.awt.*;

public class IntroTextArea extends JTextArea {

    public IntroTextArea() {
        setBounds(700, 200, 500, 350);
        setBackground(Color.BLACK);
        setFont(new Font("Arial", Font.PLAIN, 20));
        setForeground(Color.GREEN);
        setEditable(false);
        setLineWrap(true);
        setWrapStyleWord(true);
        setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        setVisible(true);



    }
}
