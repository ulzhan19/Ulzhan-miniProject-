package Ulzhan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton first;
    protected JButton second;
    protected JButton third;
    public MainMenu(){
        setSize(500,500);
        setLayout(null);
        first = new JButton("Add Student");
        first.setSize(300,30);
        first.setLocation(100,100);
        add(first);
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Main.frame.menu.setVisible(false);
                Main.frame.first.setVisible(true);
            }
        });

        second = new JButton("List Students");
        second.setSize(300,30);
        second.setLocation(100,140);
        add(second);
        second.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.frame.showSecond();
            }
        });

        third = new JButton("EXIT");
        third.setSize(300,30);
        third.setLocation(100,180);
        add(third);


    }
}
