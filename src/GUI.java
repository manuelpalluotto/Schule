import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;
    private ImageIcon spielfeld;
    private JPanel tttGrid;
    private JLabel background;


    public GUI() {
        frame = new JFrame();
        frame.setTitle("TicTacToe");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);

        spielfeld = new ImageIcon(this.getClass().getResource("/emptyTTT.jpg"));

        background = new JLabel(spielfeld);
        background.setLayout(new BorderLayout());

        tttGrid = new JPanel(new GridLayout(3, 3));
        tttGrid.setOpaque(false);


        for (int i = 0; i < 9; i++) {
            JPanel cardPanel = new JPanel(new CardLayout());
            cardPanel.setOpaque(false);

            JLabel label = creatingTheLabels("X");
            JButton button = creatingTheButtons();


            button.addActionListener(e -> {
                button.setVisible(false);
                label.setVisible(true);
            });
            cardPanel.add(button, "Button");
            cardPanel.add(label, "Label");

            tttGrid.add(cardPanel);
        }


        background.add(tttGrid, BorderLayout.CENTER);
        frame.add(background);
        frame.setVisible(true);
    }


    private JButton creatingTheButtons() {
        JButton button = new JButton();
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVisible(false);
        return button;
    }


    public static JLabel creatingTheLabels(String name) {
        JLabel label = new JLabel(name, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 120));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setVisible(false);
        return label;
    }


    public static void main(String[] args) {
        new GUI();
    }
}











/*pTopLeft = creatingTheLabels("X");
pTopCenter = creatingTheLabels("X");
pTopRight = creatingTheLabels("X");
pCenterLeft = creatingTheLabels("X");
pCenterCenter = creatingTheLabels("X");
pCenterRight = creatingTheLabels("X");
pBottomLeft = creatingTheLabels("X");
pBottomCenter = creatingTheLabels("X");
pBottomRight = creatingTheLabels("X");

JLabel[] labels = new JLabel[]{pTopLeft, pTopCenter, pTopRight, pCenterLeft, pCenterCenter, pCenterRight, pBottomLeft, pBottomCenter, pBottomRight};
        for (JLabel label : labels) {
        cardPanel.add(label);
        }


topLeft = creatingTheButtons();
topCenter = creatingTheButtons();
topRight = creatingTheButtons();
centerLeft = creatingTheButtons();
centerCenter = creatingTheButtons();
centerRight = creatingTheButtons();
bottomLeft = creatingTheButtons();
bottomCenter = creatingTheButtons();
bottomRight = creatingTheButtons();

JButton[] buttons = new JButton[]{topLeft, topCenter, topRight, centerLeft, centerCenter, centerRight, bottomLeft, bottomCenter, bottomRight};
        for (JButton button : buttons) {
        cardPanel.add(button);
        }*/


