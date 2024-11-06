import javax.swing.*;

public class Buttons {
    JButton buttons;

    public Buttons() {
        buttons = new JButton();
        buttons.setVerticalAlignment(SwingConstants.CENTER);
        buttons.setHorizontalAlignment(SwingConstants.CENTER);
        buttons.setVisible(true);
        buttons.setContentAreaFilled(false);
        buttons.setBorderPainted(true);
    }
    public JButton getButtons() {
        return buttons;
    }
}
