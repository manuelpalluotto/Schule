import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    private final ImageIcon spielfeld;
    private final JPanel tttGrid;
    private final JLabel background;
    String playerOne;
    String playerTwo;
    private ArrayList<JLabel> labelList;
    private String currentPlayer;


    public GUI() {
        spielfeld = new ImageIcon(this.getClass().getResource("/emptyTTT.jpg"));
        //das leere Bild
        currentPlayer = "X";
        labelList = new ArrayList<>();


        myFrame firstFrame = new myFrame("TicTacToe", 1920, 1137);
        //frame wird erstellt

        LoginFrame login = new LoginFrame(firstFrame.getFrame());

        IntroductionFrame intro = new IntroductionFrame(login.getlF());

        tttGrid = new JPanel(new GridLayout(3, 3));
        tttGrid.setOpaque(false);
        //ein Spielfeld 3x3 wird erstellt

        background = new JLabel(spielfeld);
        //eine Fläche für das Bild wird erstellt

        background.setLayout(new BorderLayout());
        //das Hintergrundbild eingefügt

        background.add(tttGrid, BorderLayout.CENTER);
        //das unsichtbare Spielfeld wird auf den Hintergrund gelegt

        firstFrame.getFrame().add(background);
        //der Hintergrund wird auf den Frame gelegt


        for (int i = 0; i < 9; i++) {
            playing();
        }
    }

    private void playing() {
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.setOpaque(false);

        Labels label = new Labels();
        //ein neues Label Objekt mit dem Namen label wird erstellt
        Buttons button = new Buttons(10, 5);
        //ein neues Button Objekt mit dem Namen button wird erstellt

        labelList.add(label);
        //das Label wird in eine Liste eingefügt

        button.getButtons().addActionListener(e -> {
            label.setText(currentPlayer);
            //erst beim Spielzug wird der Text zugewiesen

            label.setVisible(true);
            //das Label wird sichtbar

            button.getButtons().setVisible(false);
            //der Button wird unsichtbar

            currentPlayer = currentPlayer.equals("O") ? "X" : "O";
            //der jeweils zugewiesene Text wird für den nächsten Zug überschrieben
        });
        cardPanel.add(button.getButtons());
        cardPanel.add(label);

        tttGrid.add(cardPanel);
    }
}
