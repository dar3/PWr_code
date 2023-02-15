package gui_java1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ProstyGui {

    public static void main(String[] args) {


//        Okno, ramka (JFrame) - komponent podstawowy
        JFrame ramka = new JFrame();

        JButton przycisk1 = new JButton("Click me 1");
        JButton przycisk2 = new JButton("Click me 2");
        JButton przycisk3 = new JButton("Click me 3");
        JButton przycisk4 = new JButton("Click me 4");
        JButton przycisk5 = new JButton("Click me 5");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ramka.getContentPane().add(BorderLayout.NORTH, panel1);
        ramka.getContentPane().add(BorderLayout.WEST, panel2);
        ramka.getContentPane().add(BorderLayout.CENTER, panel3);
        ramka.getContentPane().add(BorderLayout.EAST, panel4);
        ramka.getContentPane().add(BorderLayout.SOUTH, panel5);

        panel1.add(przycisk1);
        panel2.add(przycisk2);
        panel3.add(przycisk3);
        panel4.add(przycisk4);
        panel5.add(przycisk5);

        ramka.setSize(500, 200);
        ramka.setResizable(false);
        ramka.setVisible(true);

        // ramka, panele i tam już możemy zmieniać layout


    }

}
