import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
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
    JTextArea wordPerMinute;

    Font font = new Font("Helvetica", Font.PLAIN, 24);

    public ResultFrame(){
        frame = new JFrame();

        scrWidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        scrHeight = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        frame.setSize(winWidth,winHeight);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));


        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

    mistake_Result = new JTextArea();
    mistake_Result.setEditable(false);
    mistake_Result.setFont(font);
    mistake_Result.setText("Кількість помилок: " + MenuBarLayout.mistakes);


    timer = new JTextArea();
    timer.setEditable(false);
    timer.setFont(font);
    timer.setText("Загальний час: " + MenuBarLayout.minutes + ":" + MenuBarLayout.seconds);

    wordPerMinute = new JTextArea();
    wordPerMinute.setEditable(false);
    wordPerMinute.setFont(font);
    wordPerMinute.setText("Слів за хвилину: " + MenuBarLayout.wordsPerMinute);

    panel.add(timer);
    panel.add(wordPerMinute);
    panel.add(mistake_Result);
    frame.add(panel);
    }
}
