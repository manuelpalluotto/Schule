import javax.swing.*;
import java.awt.*;

public class LoginFrame {
    private JFrame lF;
    private JTextField user1;
    private JTextField user2;
    private GridBagConstraints gbc;
    private Buttons submit;


    public LoginFrame() {
        lF = new JFrame();
        lF.setLayout(new GridBagLayout());
        lF.setSize(500, 350);
        lF.setLocationRelativeTo(null);
        lF.setVisible(true);

        gbc = new GridBagConstraints();

        submit = new Buttons();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        user1 = new JTextField("Player 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        user2 = new JTextField("Player 2");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;


    }
}
