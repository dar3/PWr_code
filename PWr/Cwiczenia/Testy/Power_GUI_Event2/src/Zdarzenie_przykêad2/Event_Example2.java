package Zdarzenie_przyk�ad2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Event_Example2 
{
	
	private JButton przycisk1;
	private JButton przycisk2;
	private int ile1, ile2;
	
	public static void main(String[] args) 
	{
		
		Event_Example2 apGUI = new Event_Example2();
		apGUI.doRysuj();
	}

	/*	Obs�uga zdarze� za pomoc� klas wewn�trznych.
	Ka�da klasa implementuje interfejs ActionListener, czyli przes�ania na sw�j spos�b actionPerformed.
	(do�� podobnie dzia�anie jak przy okre�laniu komparator�w dla kolekcji ArrayList ...)*/
	
	class ReakcjaNaPrzycisk1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
			ile1++;
			przycisk1.setText("Zosta�em klini�ty razy " + ile1);
		}		
	}
	
	class ReakcjaNaPrzycisk2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			
			ile2++;
			przycisk2.setText("Zosta�em klini�ty razy " + ile2);
		}		
	}
	
	
	//Tworzenie prostego GUI__________________________________________
	public void doRysuj() {
		
		JFrame ramka = new JFrame();
		przycisk1 = new JButton("Kliknij mnie");
		przycisk2 = new JButton("Kliknij mnie");
	
		/*Teraz ju� obiektami nas�uchuj�cymi (obserwatorami) przycisk�w 
		s� obiekty klas wewn�trznych.
		Ka�dy przycisk rejestruje swojego obserwatora*/
		przycisk1.addActionListener(new ReakcjaNaPrzycisk1());
		przycisk2.addActionListener(new ReakcjaNaPrzycisk2());
		
		JPanel panel = new JPanel();		
		ramka.getContentPane().add(panel);
		panel.add(przycisk1);
		panel.add(przycisk2);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setSize(500,300);
		ramka.setVisible(true);
	}
	//________________________________________________________________
}