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

    Timer timer;
    public static int wordsPerMinute = 0;
    int elapsedTime = 0;
    public static int minutes = 0;
    public static int seconds = 0;
    int secondCounter = 0; //create another second variable because of error
     String minutesShow;
     String secondsShow;
     JLabel wpm;

    public static JLabel stopWatch = null;
    public static JLabel mistakeCounter;
    public static int mistakes = 0; //count how much user made a mistake

    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    public static JMenuBar menuBar;

    JMenu file = new JMenu("Файл");
    JMenu window = new JMenu("Вікно");
    JMenu info = new JMenu("Питання");

    JMenuItem openFile = new JMenuItem("Відкрити файл");

    JMenuItem clearWindow = new JMenuItem("Очистити поля");
    JMenuItem closeProgram = new JMenuItem("Закрити програму");

    JMenuItem about = new JMenuItem("про програму");
    JMenuItem rules = new JMenuItem("Правила");


    public MenuBarLayout() {
        menuBar = new JMenuBar();
        mistakeCounter = new JLabel();
        wpm = new JLabel();
        stopWatch = new JLabel();
        minutesShow = String.format("%02d", minutes);
        secondsShow = String.format("%02d", seconds);
        mistakeCounter = new JLabel();
        timer = new Timer(1000, e -> {
            secondCounter+=1;
            elapsedTime += 1000;
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            wordsPerMinute = CheckText.charCount / secondCounter;
            minutesShow = String.format("%02d", minutes);
            secondsShow = String.format("%02d", seconds);
            stopWatch.setText("Час " + minutesShow + ":" + secondsShow + "  ");
            mistakeCounter.setText("Помилки: " + mistakes);
            wpm.setText("символів за секунду: " + wordsPerMinute);
        });

        stopWatch.setText("Час: " + minutesShow + ":" + secondsShow + " ");
        mistakeCounter.setText("Помилки: " + mistakes + " ");
        wpm.setText("символів за секудну: " + wordsPerMinute + " ");

        menuBar.add(file);
        menuBar.add(window);
        menuBar.add(info);

        file.add(openFile);

        window.add(clearWindow);
        window.add(closeProgram);

        info.add(about);
        info.add(rules);

        menuBar.add(stopWatch);
        menuBar.add(mistakeCounter);
        menuBar.add(wpm);
        menuBar.add(mistakeCounter);

        openFile.addActionListener(this);

        clearWindow.addActionListener(this);
        closeProgram.addActionListener(this);

        about.addActionListener(this);
        rules.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file;
        Scanner scan;
        if (e.getSource() == openFile) {
            CheckText.charCount = 0;

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

                file = fileChooser.getSelectedFile();
                try {
                    scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        line = scan.nextLine();
                        CheckText.outputText.setText(line);
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                    }
                }
            }

            if(e.getSource()==clearWindow){
                CheckText.charCount = 0;

                timer.stop();

                CheckText.inputText.setText("");
                wpm.setText("символів за секунду: 0 ");
                mistakeCounter.setText("Помилки: 0 ");
                elapsedTime = 0;

                minutesShow = String.format("%02d", 0);
                secondsShow = String.format("%02d", 0);

                stopWatch.setText("Час: " + minutesShow + ":" + secondsShow + " ");
            }

            if (e.getSource() == closeProgram) {
                System.exit(-1);
            }

            if(e.getSource()==about){
                InfoWindow openInfo = new InfoWindow();
                System.out.print("I'm placeholder!");
                openInfo.frame.setVisible(true);
            }
            if(e.getSource()==rules){
                System.out.println("I'm placeholder too!");
                RulesWindow rulesWindow = new RulesWindow();
                rulesWindow.frame.setVisible(true);
            }
        }
    }