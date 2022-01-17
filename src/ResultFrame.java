import javax.swing.*;
import java.awt.*;

public class ResultFrame {
    int winWidth = 400;
    int winHeight = 400;
    int scrHeight;
    int scrWidth;

    JFrame frame;
    JPanel panel;
    JTextArea mistake_Result;
    JTextArea timer;
    JTextArea spm;

    public ResultFrame(){
        frame = new JFrame();
        frame.setSize(winWidth,winHeight);
        frame.setJMenuBar(MenuBarLayout.menuBar);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

    mistake_Result = new JTextArea();
    mistake_Result.setText(String.valueOf(MenuBarLayout.mistakes));

    timer = new JTextArea();
    timer.setText(MenuBarLayout.minutesShow + "хв." + MenuBarLayout.secondsShow +"с.");

    panel.add(mistake_Result);
    panel.add(timer);
    }
}
