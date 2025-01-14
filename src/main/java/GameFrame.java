import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    private GUI gui;
    private Dimension screenSize;
    private JLabel backgroundLabel;
    private JPanel gridPanel;
    private String currentPlayer;
    private String[][] playButtons = new String[3][3];


    public GameFrame(GUI gui) {
        currentPlayer = "X";

        this.gui = gui;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        backgroundLabel = new JLabel(new ImageIcon(GameFrame.class.getResource("/TTT3.png")));
        backgroundLabel.setLayout(new BorderLayout());

        gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setOpaque(false);
        gridPanel.setSize(screenSize.width, screenSize.height);


        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                JButton playButton = new JButton("");
                playButton.setFont(new Font("Times New Roman", Font.BOLD, 50));
                playButton.setContentAreaFilled(false);
                playButton.setBorderPainted(false);

                gridPanel.add(playButton);

                int finalY = y;
                int finalX = x;


                playButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buttonAction(playButton, finalX, finalY);
                    }
                });
            }
        }

        backgroundLabel.add(gridPanel);
        add(backgroundLabel);
        setVisible(true);
    }

    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (playButtons[i][0] == currentPlayer && playButtons[i][1] == currentPlayer && playButtons[i][2] == currentPlayer) {
                return true;
            }
            if (playButtons[0][i] == currentPlayer && playButtons[1][i] == currentPlayer && playButtons[2][i] == currentPlayer) {
                return true;
            }
        }

        if (playButtons[0][0] == currentPlayer && playButtons[1][1] == currentPlayer && playButtons[2][2] == currentPlayer) {
            return true;
        }
        if (playButtons[0][2] == currentPlayer && playButtons[1][1] == currentPlayer && playButtons[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }


    public void buttonAction(JButton playButton, int x, int y) {

        if (!playButton.getText().equals("")) return;

        playButton.setText(currentPlayer);
        playButtons[y][x] = currentPlayer;
        if (checkWin()) {
            JDialog d = new JDialog(this, "dialog Box");

            // create a label
            JLabel l = new JLabel(currentPlayer + " won!!!");

            d.add(l);

            // setsize of dialog
            d.setSize(500, 500);

            // set visibility of dialog
            d.setVisible(true);
        }
        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }
}
