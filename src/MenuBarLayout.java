import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class MenuBarLayout implements ActionListener {

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

    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

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


    public MenuBarLayout() {
        menuBar = new JMenuBar();
        mistakeCounter = new JLabel();
        wpm = new JLabel();
        stopWatch = new JLabel();
        minutesShow = String.format("%02d", minutes);
        secondsShow = String.format("%02d", seconds);
        mistakeCounter = new JLabel();
        timer = new Timer(1000, e -> {
            elapsedTime += 1000;
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            wordsPerMinute = CheckText.charCount / seconds;
            minutesShow = String.format("%02d", minutes);
            secondsShow = String.format("%02d", seconds);
            stopWatch.setText("Час " + minutesShow + ":" + secondsShow + "  ");
            mistakeCounter.setText("Помилки: " + mistakes);
            wpm.setText("символів за секунду: " + wordsPerMinute);
            System.out.print(wordsPerMinute + " ");
        });

        stopWatch.setText("Час: " + minutesShow + ":" + secondsShow + " ");
        mistakeCounter.setText("Помилки: " + mistakes + " ");
        wpm.setText("символів за секудну: " + wordsPerMinute + " ");
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

        openFile.addActionListener(this);

        closeProgram.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == openFile) {
            CheckText.charCount = 0;
            //timer.restart();
            timer.stop();
            String line;
            CheckText.outputText.setText("");
            CheckText.inputText.setText("");
            wpm.setText("символів за секунду: 0");
            mistakeCounter.setText("Помилки: 0 ");
            elapsedTime = 0;

            minutesShow = String.format("%02d", 0);
            secondsShow = String.format("%02d", 0);

            stopWatch.setText("Час: " + minutesShow + ":" + secondsShow + " ");
            int returnValue = fileChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){

                File file = fileChooser.getSelectedFile();
                try {
                    Scanner scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        line = scan.nextLine();
                        CheckText.outputText.setText(line);
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }

            if (e.getSource() == closeProgram) {
                System.exit(-1);
            }
        }
    }}


