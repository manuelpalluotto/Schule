import javax.swing.*;
import java.awt.*;

public class LoginFrame {
    private JFrame lF;
    private JTextField user1;
    private JTextField user2;
    private GridBagConstraints gbc;
    private Labels u1;
    private Labels u2;
    private ContinueButtons next;


    public LoginFrame(JFrame nextFrame) {
        lF = new JFrame();
        lF.setLayout(new GridBagLayout());
        lF.setSize(900, 750);
        lF.setLocationRelativeTo(null);
        lF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gbc = new GridBagConstraints();

        u1 = new Labels("Spieler 1: Namen eingeben ->", gbc.gridwidth, gbc.gridheight);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        u1.setNewFont(15);
        u1.setMyLabelVisible();
        lF.add(u1.getLabel(), gbc);

        u2 = new Labels("Spieler 2, Namen eingeben ->", gbc.gridwidth, gbc.gridheight);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        u2.setNewFont(15);
        u2.setMyLabelVisible();
        lF.add(u2.getLabel(), gbc);

        user1 = new JTextField();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lF.add(user1, gbc);

//        user2 = new JTextField();
//        gbc.gridx = 2;
//        gbc.gridy = 3;
//        gbc.gridwidth = 5;
//        gbc.gridheight = 1;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        lF.add(user2, gbc);



        next = new ContinueButtons(10, 2);

        lF.add(next.getContinueButton());

        lF.setVisible(false);

        ContinueButtons.disposerButton(next.getContinueButton(), lF, nextFrame);

    }

    public JFrame getlF() {
        return lF;
    }
}
