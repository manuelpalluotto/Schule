import javax.swing.*;

public class Buttons {
    JButton buttons;

    public Buttons(int width, int height) {
        buttons = new JButton();
        buttons.setSize(width, height);
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
