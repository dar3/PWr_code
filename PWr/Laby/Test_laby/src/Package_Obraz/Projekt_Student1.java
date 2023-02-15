package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.*;
import Package_AlgorytmyObrazuPreProcessing.*;

public class Projekt_Student1 extends Obraz {

	/*W konstruktorze klasy Projektu Studenta ustawiamy jego kombinacje 
	algorytmów - tj. które dok³adnie sposoby na realizacje preprocessingu 
	oraz binaryzacji obrazu wykorzysta*/
	public Projekt_Student1() {
		
		PreProc = new Sposób_1_NaWykonaniePreProcessing();
		setAlgorytmInfoPreProcessing("Algorytm 1 na PreProcessing Obrazu Cyfrowego");
		
		BinObr = new Sposób_2_NaWykonanieBinaryzacji();
		setAlgorytmInfoBinaryzacja("Algorytm 2 na Binaryzacjê Obrazu");
	}
	
	
	
	//Wyœwietlenie informacji, który student, z którego algorytmu korzysta.
	@Override
	public void WyswietlInfo() {
		
		System.out.println("\nStudent 1 u¿ywa " + getAlgorytmInfoPreProcessing());
		System.out.println("Student 1 u¿ywa " + getAlgorytmInfoBinaryzacja());
	}

	
	//Inne Metody Studenta 1, dotycz¹ce przetwarzania i analizy obrazu ...
	
}
