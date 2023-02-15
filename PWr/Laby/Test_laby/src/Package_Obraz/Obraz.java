package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.*;
import Package_AlgorytmyObrazuPreProcessing.*;

public abstract class Obraz {

	/*Zak�adamy rozbudowan� klas� w kontek�cie obrazu:
		konstruktor tworz�cy obraz + inne metody dla obrazu*/
	
	
	/*To s� 'uchwyty'na nasze strategie - czyli algorytmy preprocessingu obrazu oraz jego binaryzacji
	Strategie s� dost�pne w kodzie g��wnego programu poprzez agregacje referencji na interfejsy strategii !
	Poniewa� te referencje istniej� tylko po to, aby je udost�pni� klasom poni�ej, to mog� by� protected.******/
	protected PrzetworzenieObrazu_PreProcessing PreProc;
	protected WykonanieBinaryzacjiObrazu BinObr;
	//**********************************************************************************************************
	
	//Zmienne pomocnicze________________________
	private String AlgorytmInfoPreProcessing;
	private String AlgorytmInfoBinaryzacja;
	//__________________________________________
	
	
	
	public void wykonajStartegie(int nr_Strategii) {
		
		switch(nr_Strategii) {
		
		case 1 :
			PreProc.SposóbNaWykonaniePreProcessing();
			break;		
		case 2 :
			BinObr.SposóbNaWykonanieBinaryzacji();
			break;	
		default : System.out.println("Brak wybranej strategii");
		}
		
	}
	
	public void ustawNowaStrategia(int nr_Strategii, PrzetworzenieObrazu_PreProcessing p, String AlgInfo1, WykonanieBinaryzacjiObrazu b, String AlgInfo2) {
		
		switch(nr_Strategii) {
		
		case 1 :
			if (p!=null) {
				
				this.PreProc = p;
				this.AlgorytmInfoPreProcessing = AlgInfo1;
			}		
			break;	 
		case 2 :
			if (b!=null) {
				
			   	this.BinObr = b;	
		    	this.AlgorytmInfoBinaryzacja = AlgInfo2;
			}		
			break;	
		default : System.out.println("Brak wybranej strategii");
		}	
		
	}
	

    //_____________________________________________________________________________________
    
    
    
    /*W klasie zak��damy r�wniez inne metody - nie sa one u�ywane
     * (+ set-ery, get-ery) itd. - nie jest to istotne w kontek�cie samego wzorca*/
    //////////////////////////////////////////////////////////////////////////////////////////
    abstract public void WyswietlInfo();
    
	public void ZaladujObraz() {
		System.out.println("�adowanie obrazu");
	}
	
	public void ZapiszObraz() {
		System.out.println("Zapis obrazu do pliku");
	}
	
	//public void getImage(){ return obr; }

	
	public String getAlgorytmInfoPreProcessing() {
		return this.AlgorytmInfoPreProcessing;
	}	
	
	public void setAlgorytmInfoPreProcessing(String s) {
		this.AlgorytmInfoPreProcessing = s;
	}
	
	public String getAlgorytmInfoBinaryzacja() {
		return this.AlgorytmInfoBinaryzacja;
	}
		
	public void setAlgorytmInfoBinaryzacja(String s) {
		this.AlgorytmInfoBinaryzacja = s;
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////
}