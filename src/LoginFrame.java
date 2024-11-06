import javax.swing.*;
import java.awt.*;

public class LoginFrame {
    private JFrame lF;
    private JTextField user1;
    private JTextField user2;
    private GridBagConstraints gbc;
    private Buttons submit;
    private Labels u1;
    private Labels u2;
    private ContinueButtons next;


    public LoginFrame(JFrame nextFrame) {
        lF = new JFrame();
        lF.setLayout(new GridBagLayout());
        lF.setSize(900, 750);
        lF.setLocationRelativeTo(null);

        gbc = new GridBagConstraints();

        u1 = new Labels("Spieler 1: Namen eingeben ->", 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        user1 = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        user2 = new JTextField("Player 2");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        u2 = new Labels("Spieler 2, Namen eingeben ->", 5);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        submit = new Buttons(10, 5);
        submit.getButtons().setName("Continue");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        next = new ContinueButtons(10, 2);

        lF.add(u1.getLabel());
        lF.add(u2.getLabel());
        lF.add(user1);
        lF.add(user2);
        lF.add(submit.getButtons());
        lF.add(next.getContinueButton());

        lF.setVisible(false);

        ContinueButtons.disposerButton(next.getContinueButton(), lF, nextFrame);

    }

    public JFrame getlF() {
        return lF;
    }
}
