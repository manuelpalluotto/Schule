import javax.swing.*;

public class GUI {
    FirstFrame whereIntroductionIsShown;
    LoginFrame whereUserCanInput;
    GameFrame whereTheGridIsShown;


    public GUI() {
        Button nextFrameButton = new Button();

        //den schließen
        whereIntroductionIsShown = new FirstFrame();

        //den öffnen
        whereUserCanInput = new LoginFrame();




        whereTheGridIsShown = new GameFrame();

    }

    public JFrame getWhereIntroductionIsShown() {
        return whereIntroductionIsShown;
    }

    public JFrame getWhereUserCanInput() {
        return whereUserCanInput;
    }

    public JFrame getWhereTheGridIsShown() {
        return whereTheGridIsShown;
    }
}
