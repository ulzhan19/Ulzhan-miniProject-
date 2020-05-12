package Ulzhan;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class AddStudent extends Container {
    public AddStudent(){
        Students st = new Students();
        setSize(500,500);

        setLayout(null);

        JLabel lbl = new JLabel("NAME:");
        lbl.setSize(300,30);
        lbl.setLocation(120,40);
        add(lbl);

        JTextField textField = new JTextField();
        textField.setSize(150,30);
        textField.setLocation(190,40);
        add(textField);

        JLabel lbl2 = new JLabel("SURNAME:");
        lbl2.setSize(300,30);
        lbl2.setLocation(95,90);
        add(lbl2);

        JTextField textField2 = new JTextField();
        textField2.setSize(150,30);
        textField2.setLocation(190,90);
        add(textField2);

        JLabel lbl3 = new JLabel("AGE:");
        lbl3.setSize(300,30);
        lbl3.setLocation(130,140);
        add(lbl3);

        JTextField textField3 = new JTextField();
        textField3.setSize(150,30);
        textField3.setLocation(190,140);
        add(textField3);

        JButton btn = new JButton("ADD");
        btn.setSize(120,30);
        btn.setLocation(100,210);
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                String txt = lbl3.getText();
//                lbl.setText(txt);

                st.getSurname();
                String txt = lbl3.getName();
                lbl.setText(st.getSurname().toString());



            }
        });


        JButton back = new JButton("Back");
        back.setSize(120,30);
        back.setLocation(270,210);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.frame.showMenu();
            }
        });
    }

}
