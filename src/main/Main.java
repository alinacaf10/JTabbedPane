package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel lb1 = new JLabel("First pane");
        JPanel p1 = new JPanel();
        p1.add(lb1);

        JLabel lb2 = new JLabel("Second pane");
        JPanel p2 = new JPanel();
        p2.add(lb2);

        JLabel lb3 = new JLabel("Third pane");
        JPanel p3 = new JPanel();
        p3.add(lb3);

        JTabbedPane tb=new JTabbedPane();
        tb.setBounds(50,50,200,200);
        tb.add("First",p1);
        tb.add("Second",p2);
        tb.add("Third",p3);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.add(tb);
    }
}
