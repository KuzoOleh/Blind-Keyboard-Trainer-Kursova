import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class ResultFrame {
    int winWidth = 400;
    int winHeight = 400;
    int scrHeight;
    int scrWidth;

    JFrame frame;
    JTextArea mistake_Result;

    public ResultFrame(){
        frame = new JFrame();
        frame.setSize(winWidth,winHeight);
        frame.setJMenuBar(MenuBarLayout.menuBar);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    mistake_Result = new JTextArea();
    mistake_Result.setText(String.valueOf(MenuBarLayout.mistakes));
    frame.add(mistake_Result);
    }
}
