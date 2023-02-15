package Sniadanie_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sniadanie {
    private JButton akceptujButton;
    private JCheckBox rogalikCheckbox;
    private JCheckBox jajecznicaCheckbox;
    private JCheckBox herbataCheckbox;
    private JCheckBox kawaCheckbox;
    private JTextField doZaplatyTextField;
    private JTextField skladnikiTextField;

    private double suma;


    public static void main(String[] args) {

        Sniadanie app = new Sniadanie();
        app.doRysuj();
    }


    class ReakcjaNaPrzyciski implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            suma = 0;
            String menu = "";
            if(rogalikCheckbox.isSelected()){
                suma = suma + 5.0;
                menu = menu + rogalikCheckbox.getText().split(" ")[0] + ",";

            }
            if(jajecznicaCheckbox.isSelected() == true){
                suma = suma + 15.0;
                menu = menu + jajecznicaCheckbox.getText().split(" ")[0] + ",";
            }
            if(herbataCheckbox.isSelected()){
                suma = suma + 4.0;
                menu = menu + herbataCheckbox.getText().split(" ")[0] + ",";

            }
            if(kawaCheckbox.isSelected()){
                suma = suma + 6.0;
                menu = menu + kawaCheckbox.getText().split(" ")[0] + ",";
            }

            doZaplatyTextField.setText(" " + suma);
            skladnikiTextField.setText(menu);
        }
    }

    private void doRysuj(){
        JFrame ramka = new JFrame();
        ramka.setTitle("Sniadanie");


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ramka.getContentPane().add(BorderLayout.WEST, panel1);
        ramka.getContentPane().add(BorderLayout.EAST, panel2);

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("Menu"));
        rogalikCheckbox = new  JCheckBox("Rogalik - 5zl");
        jajecznicaCheckbox =  new JCheckBox("Jajecznica - 15zl");
        herbataCheckbox = new JCheckBox("Herbata - 4zl");
        kawaCheckbox = new JCheckBox("Kawa - 6zl");
        akceptujButton = new JButton("Akceptuj");
        akceptujButton.addActionListener(new ReakcjaNaPrzyciski());
        panel1.add(rogalikCheckbox);
        panel1.add(jajecznicaCheckbox);
        panel1.add(herbataCheckbox);
        panel1.add(kawaCheckbox);
        panel1.add(akceptujButton);



        skladnikiTextField = new JTextField();
        doZaplatyTextField = new JTextField();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(new JLabel("Moje sniadanie"));
        panel2.add(skladnikiTextField);
        panel2.add(new JLabel("Kwota do zaplaty"));
        panel2.add(doZaplatyTextField);

//        ramka.setSize(430, 210);
        ramka.setSize(300, 200);
        ramka.setResizable(true);
        ramka.setVisible(true);
    }

}


