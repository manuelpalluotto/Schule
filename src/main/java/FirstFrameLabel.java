import javax.swing.*;
import java.awt.*;

public class FirstFrameLabel extends JLabel {
    private IntroTextArea text;
    private Button nextFrameButton;
    private GUI gui; // Referenz zur GUI-Klasse

    public FirstFrameLabel(GUI gui) {
        // Übergabe der GUI-Instanz
        this.gui = gui;

        // Erstelle die Komponenten
        nextFrameButton = new Button();
        text = new IntroTextArea();

        setLayout(new BorderLayout());

        nextFrameButton.fromFirstFrametoLoginFrameButton(
                gui.whereIntroductionIsShown,
                nextFrameButton,
                gui.whereUserCanInput
        );


        setBackground(Color.BLACK);
        setLayout(null);
        add(nextFrameButton);
        add(text);
        setVisible(true);
    }


    public JLabel getFirstFrameLabel() {
        return this;
    }
}
