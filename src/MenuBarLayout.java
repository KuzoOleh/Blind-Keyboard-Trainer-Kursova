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

    static Timer timer;
    private static int wordsPerMinute = 0;
    int elapsedTime = 0;
    private static int minutes = 0;
    private static int seconds = 0;
    private static int secondCounter = 1; //create another second variable because of error
     String minutesShow;
     String secondsShow;
     JLabel wpm;

    private static JLabel stopWatch = null;
    private static int mistakes = -1; //count how much user have made a mistake

    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    private static JMenuBar menuBar;

    JMenu file = new JMenu("Файл");
    JMenu window = new JMenu("Вікно");
    JMenu info = new JMenu("Питання");

    JMenuItem openFile = new JMenuItem("Відкрити файл");

    JMenuItem closeProgram = new JMenuItem("Закрити програму");

    JMenuItem about = new JMenuItem("про програму");
    JMenuItem rules = new JMenuItem("Правила");

    MenuBarLayout() {
        menuBar = new JMenuBar();

        wpm = new JLabel();
        stopWatch = new JLabel();
        minutesShow = String.format("%02d", minutes);
        secondsShow = String.format("%02d", seconds);

        //setting timer
        timer = new Timer(1000, e -> {
            secondCounter+=1;
            elapsedTime += 1000;
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;

            wordsPerMinute = (int)((((double)CheckText.getCharCount() / 5) / secondCounter) * 60);
            minutesShow = String.format("%02d", minutes);
            secondsShow = String.format("%02d", seconds);
            stopWatch.setText("     Час " + minutesShow + ":" + secondsShow + "  ");
        });

        stopWatch.setText("     Час: " + minutesShow + ":" + secondsShow + " ");

        //adding components to the menu
        menuBar.add(file);
        menuBar.add(window);
        menuBar.add(info);

        file.add(openFile);

        window.add(closeProgram);
        //adding items to info
        info.add(about);
        info.add(rules);

        menuBar.add(stopWatch);

        //adding action listeners to menu items
        openFile.addActionListener(this);

        closeProgram.addActionListener(this);

        about.addActionListener(this);
        rules.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file;
        Scanner scan;
        String line;

        if (e.getSource() == openFile) {
            CheckText.setCharCount(0);
            CheckText.setLocalCharCount(0);
            mistakes = 0;

            timer.stop();

            CheckText.outputText.setText("");
            CheckText.inputText.setText("");
            elapsedTime = 0;

            minutesShow = String.format("%02d", 0);
            secondsShow = String.format("%02d", 0);
            stopWatch.setText("     Час: " + minutesShow + ":" + secondsShow + " ");

            //adding text to outputText
            int returnValue = fileChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){

                file = fileChooser.getSelectedFile();
                try {
                    scan = new Scanner(file);

                    while(scan.hasNextLine()){
                        line = scan.nextLine();

                        CheckText.outputText.setText(CheckText.outputText.getText() + line + "\n");
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                    }
                }
            }

            //closing program
            if (e.getSource() == closeProgram) {
                System.exit(-1);
            }
            //opening InfoWindow
            if(e.getSource()==about){
                InfoWindow openInfo = new InfoWindow();
                openInfo.frame.setVisible(true);
            }
            //opening RulesWindow
            if(e.getSource()==rules){
                RulesWindow rulesWindow = new RulesWindow();
                rulesWindow.frame.setVisible(true);
            }
        }

        //adding getters and setters

    public static int getWordsPerMinute() {
        return wordsPerMinute;
    }

    public static int getMinutes() {
        return minutes;
    }

    public static int getSeconds() {
        return seconds;
    }

    public static int getMistakes() {
        return mistakes;
    }

    public static void setMistakes(int mistakes) {
        MenuBarLayout.mistakes = mistakes;
    }

    public static JMenuBar getMenuBar() {
        return menuBar;
    }


}