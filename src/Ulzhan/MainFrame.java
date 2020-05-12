package Ulzhan;

import javax.swing.*;

public class MainFrame extends JFrame {
    protected  MainMenu menu;
    protected AddStudent first;
    protected ListStudents second;
    protected Exit third;

    public MainFrame(){
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ulzhan and Dana");
        setLayout(null);

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        first = new AddStudent();
        first.setVisible(false);
        add(first);

        second = new ListStudents();
        second.setVisible(false);
        add(second);

        third = new Exit();
        third.setVisible(false);
        add(third);
    }
    public void showFirst(){
        menu.setVisible(false);
        first.setVisible(true);
        second.setVisible(false);
        third.setVisible(false);
    }
    public void showMenu(){
        second.setVisible(false);
        third.setVisible(false);
        first.setVisible(false);
        menu.setVisible(true);
    }
    public void showSecond(){
        menu.setVisible(false);
        third.setVisible(false);
        first.setVisible(false);
        second.setVisible(true);
    }
    public void showThird(){
        menu.setVisible(false);
        first.setVisible(false);
        second.setVisible(false);
        third.setVisible(true);
    }

}
