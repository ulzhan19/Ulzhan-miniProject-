package Ulzhan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ListStudents extends Container {
    public ListStudents(){
        setSize(500,500);

        setLayout(null);

        JLabel lbl = new JLabel("NAME:");
        lbl.setSize(300,30);
        lbl.setLocation(60,40);
        add(lbl);



        JLabel lbl2 = new JLabel("SURNAME:");
        lbl2.setSize(300,30);
        lbl2.setLocation(160,40);
        add(lbl2);


        JLabel lbl3 = new JLabel("AGE:");
        lbl3.setSize(300,30);
        lbl3.setLocation(310,40);
        add(lbl3);






        JButton back = new JButton("Back");
        back.setSize(120,30);
        back.setLocation(175,210);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.frame.showMenu();
            }
        });

    }

}
