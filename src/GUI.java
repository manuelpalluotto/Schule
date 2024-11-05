import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    private JFrame frame;
    private ImageIcon spielfeld;
    private JPanel tttGrid;
    private JLabel background;
    private ArrayList<JLabel> labelList;
    private String currentPlayer;
    private JTextArea introduction;
    private String playerOne;
    private String playerTwo;

    public GUI() {
        currentPlayer = "X";
        labelList = new ArrayList<>();
        frame = new JFrame();
        frame.setTitle("TicTacToe");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);

        introduction = new JTextArea(5, 20);
        introduction.setSize(450, 300);
        introduction.setText("Viel Spaß beim nachfolgenden Spiel Tic Tac Toe. Falls du die Regeln nicht kennst, " +
                "hier einmal erklärt: Jeder Spieler darf nacheinander einen Stein setzen, entweder ein 'X' " +
                "oder ein 'O'.\" +" +
                " \"\\n\" + \"Der Spieler, der zuerst\" + " +
                " \" drei Steine in eine Reihe, senkrecht oder waagrecht, setzen kann hat gewonnen!");
        introduction.setFont(new Font("Arial", 2, 22));
        introduction.setLineWrap(true);
        introduction.setWrapStyleWord(true);



        spielfeld = new ImageIcon(this.getClass().getResource("/emptyTTT.jpg"));

        background = new JLabel(spielfeld);
        background.setLayout(new BorderLayout());
        background.add(introduction);

        tttGrid = new JPanel(new GridLayout(3, 3));
        tttGrid.setOpaque(false);


        for (int i = 0; i < 9; i++) {
            playing();
        }


        background.add(tttGrid, BorderLayout.CENTER);
        frame.add(background);
        frame.setVisible(true);
    }

    private void playing() {
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.setOpaque(false);

        JLabel label = creatingTheLabels("");
        JButton button = creatingTheButtons();

        labelList.add(label);

        button.addActionListener(e -> {
            label.setText(currentPlayer);
            label.setVisible(true);
            button.setVisible(false);

            currentPlayer = currentPlayer.equals("O") ? "X" : "O";
        });
        cardPanel.add(button, "Button");
        cardPanel.add(label, "Label");

        tttGrid.add(cardPanel);
    }

    public static JButton creatingTheButtons() {
        JButton button = new JButton();
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVisible(true);
        button.setContentAreaFilled(false);
        button.setBorderPainted(true);
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
        SwingUtilities.invokeLater(GUI::new);
    }
}
