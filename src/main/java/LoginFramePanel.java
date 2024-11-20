import javax.swing.*;

public class LoginFramePanel extends JPanel {
     GUI gui;
     Button nextFrameButton;
     JTextField firstUsernameTextField;
     JTextField secondUsernameTextField;


    public LoginFramePanel(GUI gui) {
        this.gui = gui;
        setSize(1920, 1080);
        setLayout(null);

        nextFrameButton = new Button();
        nextFrameButton.setText("Submit");
        nextFrameButton.setBounds(910,400, 100, 35);
        add(nextFrameButton);
        nextFrameButton.addActionListener(e -> {
           gui.whereUserCanInput.dispose();
           gui.whereTheGridIsShown.setVisible(true);
        });

        firstUsernameTextField = new JTextField();
        firstUsernameTextField.setBounds(760,330, 400, 35);

        secondUsernameTextField = new JTextField();
        secondUsernameTextField.setBounds(760,365, 400, 35);

        add(firstUsernameTextField);
        add(secondUsernameTextField);


        setVisible(true);
    }


    public JPanel getLoginFramePanel() {
        return this;
    }
}