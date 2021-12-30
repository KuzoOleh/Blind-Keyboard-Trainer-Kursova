import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;
public class MenuBarLayout {

   //CheckText checkText = new CheckText();

    Timer timer;
    int wordsPerMinute = 0;
    int elapsedTime = 0;
    int minutes = 0;
    int seconds = 0;
    String minutesShow;
    String secondsShow;
    public JLabel wpm;

    JLabel stopWatch;
    public static JLabel mistakeCounter;
    public static int mistakes = 0; //count how much user made a mistake

    public static JMenuBar menuBar;

    JMenu file = new JMenu("Файл");
    JMenu window = new JMenu("Вікно");
    JMenu rules = new JMenu("Питання");

    JMenuItem openFile = new JMenuItem("Відкрити файл");
    JMenuItem openRecentFile = new JMenuItem("Відкрити попередній файл");

    JMenuItem clearWindow = new JMenuItem("Очистити поля");
    JMenuItem closeProgram = new JMenuItem("Закрити програму");

    JMenuItem about = new JMenuItem("про програму");
    JMenuItem info = new JMenuItem("Правила");


    public MenuBarLayout(){
        menuBar = new JMenuBar();
        mistakeCounter = new JLabel();
        wpm = new JLabel();
        stopWatch = new JLabel();
        minutesShow = String.format("%02d",minutes);
        secondsShow = String.format("%02d",seconds);
        mistakeCounter = new JLabel();
        timer = new Timer(1000, e -> {
            elapsedTime +=1000;
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            wordsPerMinute = (CheckText.charCount/5)/seconds;
            minutesShow = String.format("%02d",minutes);
            secondsShow = String.format("%02d",seconds);
            stopWatch.setText("Час " + minutesShow+":"+secondsShow + "  ");
            mistakeCounter.setText("Помилки: " + mistakes);
            wpm.setText("слів за хвилину: " + wordsPerMinute);
            System.out.print(wordsPerMinute+  " ");
        });

        stopWatch.setText("Час: " + minutesShow+":"+secondsShow + " ");
        mistakeCounter.setText("Помилки: " + mistakes + " ");
        wpm.setText("слів за хвилину: " + wordsPerMinute + " ");
        //mistakeCounter.setText("Помиклки: " + CheckText.mistakeCount);

        menuBar.add(file);
        menuBar.add(window);
        menuBar.add(rules);

        file.add(openFile);
        file.add(openRecentFile);

        window.add(clearWindow);
        window.add(closeProgram);

        rules.add(about);
        rules.add(info);

        menuBar.add(stopWatch);
        menuBar.add(mistakeCounter);
        menuBar.add(wpm);
        menuBar.add(mistakeCounter);
    }
}
