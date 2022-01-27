import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;

public class InfoWindow {
    JFrame frame;
    JPanel panel;
    int scrWidth;
    int scrHeight;

    int winWidth = 500;
    int winHeight = 200;

    JTextArea projectName;
    JTextArea author;
    Font font = new Font("Helvetica", Font.PLAIN, 24);
    public InfoWindow(){
        frame = new JFrame();
        frame.setSize(winWidth,winHeight);
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        scrWidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        scrHeight = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        
        projectName = new JTextArea();
        projectName.setFont(font);
        projectName.setEditable(false);
        projectName.setText("Програма тренажер сліпого друку");

        author = new JTextArea();
        author.setFont(font);
        author.setEditable(false);
        author.setText("Автор програми - Кузьо Олег");

        panel.add(projectName);
        panel.add(author);
        frame.add(panel);

    }
}
