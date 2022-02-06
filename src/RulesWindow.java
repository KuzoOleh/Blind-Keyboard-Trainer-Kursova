import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Font;

public class RulesWindow {
    JFrame frame;
    JTextPane placeholder;
    JScrollPane scrollPane;

    int scrWidth;
    int scrHeight;

    int winWidth = 500;
    int winHeight = 500;

    Font font = new Font("Helvetica", Font.PLAIN, 20);

    public RulesWindow(){
        placeholder = new JTextPane();
        scrollPane = new JScrollPane(placeholder);

        frame = new JFrame();
        //setting centralized window
        scrWidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        scrHeight = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        frame.setSize(winWidth,winHeight);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));


        ImageIcon img = new ImageIcon("src\\resources\\icon\\logo.png");
        frame.setIconImage(img.getImage());

        placeholder.setFont(font);
        placeholder.setEditable(false);
        placeholder.setText("""
                Правила користування програмою

                Після того, як користувач відкрив програму, на екрані з'являється вікно з меню, двома полями і віртуальною клавіатурою.\s

                За допомопогою меню користувач має можливість вибрати необхідний файл в форматі .txt, закривати програму і очищувати поле для вводу тексту, а також ознайомитися з правилами і автором.

                Після того, як користувач обрав файл, в білому полі появиться текст, який необхідно вписувати в сіре поле, натиснувши на це поле один раз і почавши писати текст.

                Після того, як користувач написав певну частину тексту до крапки, весь прописаний текст видаляється, але таймер не зупиняється. Таймер зупиниться тоді, коли користувач
                напише весь текст і натисне пробіл.

                Віртуальна клавіатура служить орієнтиром для користувача. Віртуальна клавіатура поділена на 8 кольорів: сіра, рожева, зелена, блакитна, фіолетова і помаранчева.

                Кожен з цих кольорів (окрім сірого і помаранчевого) визначають палець, яким треба натискати на кнопку:сірий і рожевий - мізинець, жовтий - безіменні, зелений - середні,\s
                блакитний - вказівні, помаранчевий - великі пальці.""");

        frame.add(scrollPane);
    }
}
