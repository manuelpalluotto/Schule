import javax.swing.*;

public class GUI {
    FirstFrame whereIntroductionIsShown;
    LoginFrame whereUserCanInput;
    GameFrame whereTheGridIsShown;
    private FirstFrameLabel label;

    public GUI() {
        label = new FirstFrameLabel(this);

        whereIntroductionIsShown = new FirstFrame();
        whereUserCanInput = new LoginFrame();
        whereTheGridIsShown = new GameFrame();

        whereIntroductionIsShown.add(label.getFirstFrameLabel());

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
