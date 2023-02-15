package Cw6;

public class Pies extends Zwierze {
//max 3 obroze
   private Obroza[] obroze = new Obroza[3];
    private String rasa;

public void KupObroze(String kolor, boolean czySkorzana, boolean przeciwPchlom){
    for (int i = 0; i < obroze.length; i++) {
        if(obroze[i] == null){
            obroze[i] = new Obroza(kolor, czySkorzana, przeciwPchlom);
            System.out.println("Kupiłeś obrożę");
            return;
        }


    }
}

    @Override
    public String DajGlos() {
        return "Hau, hau, hau";
    }

    public Pies() {
    }

    public Pies(Obroza[] obroze, String rasa) {
        this.obroze = obroze;
        this.rasa = rasa;
    }

    public Obroza[] getObroze() {
        return obroze;
    }

    public void setObroze(Obroza[] obroze) {
        this.obroze = obroze;
    }
}
