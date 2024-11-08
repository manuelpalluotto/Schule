import javax.swing.*;
import java.awt.*;

public class LoginFrame {
    private JFrame lF;
    private JPanel loginPanel;
    private JTextField user1;
    private JTextField user2;
    private Labels u1;
    private Labels u2;
    private ContinueButtons next;


    public LoginFrame(JFrame nextFrame) {
        lF = new JFrame();
        lF.setSize(900, 750);
        lF.setLocationRelativeTo(null);
        lF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.black);

        u1 = new Labels();
        u1.setText("<html><font color='green'>Spieler 1, Namen eingeben -> </font></html>");
        u1.setForeground(Color.white);
        u1.setBounds(25, 80, 200, 25);
        loginPanel.add(u1);
        u1.setVisible(true);

        u2 = new Labels();
        u2.setText("<html><font color='green'>Spieler 1, Namen eingeben -> </font></html>");
        u2.setForeground(Color.white);
        u2.setBounds(25, 120, 200, 25);
        loginPanel.add(u2);
        u2.setVisible(true);

        user1 = new JTextField();
        user1.setBounds(250, 80, 200, 25);
        user1.setVisible(true);
        loginPanel.add(user1);

        user2 = new JTextField();
        user2.setBounds(250, 120, 200, 25);
        user2.setVisible(true);
        loginPanel.add(user2);



        next = new ContinueButtons(10, 2);

        loginPanel.add(next.getContinueButton());
        lF.add(loginPanel);
        lF.setVisible(false);

        ContinueButtons.disposerButton(next.getContinueButton(), lF, nextFrame);

    }

    public JFrame getlF() {
        return lF;
    }
}
