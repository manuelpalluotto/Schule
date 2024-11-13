import javax.swing.*;
import java.awt.*;

public class Introduction {
    public JTextArea introduction;

    public Introduction(int width, int height) {
        introduction = new JTextArea(5, 20);
        introduction.setSize(width, height);
        introduction.setText("Viel Spaß beim nachfolgenden Spiel Tic Tac Toe. Falls du die Regeln nicht kennst, hier einmal erklärt: Jeder Spieler darf nacheinander einen Stein setzen, entweder ein 'X' oder ein 'O'. Der Spieler, der zuerst drei Steine in eine Reihe, senkrecht oder waagrecht, setzen kann hat gewonnen!");
        introduction.setFont(new Font("Arial", 2, 22));
        introduction.setLineWrap(true);
        introduction.setWrapStyleWord(true);
    }

    public JTextArea getIntroduction() {
        return introduction;
    }
}
