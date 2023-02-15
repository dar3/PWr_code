package Cw6;

public abstract class Zwierze {

private  String nazwa;
private boolean czyDzikie;
private boolean czyGrozny;
private boolean czySzczepiony;



public abstract String DajGlos();


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyDzikie() {
        return czyDzikie;
    }

    public void setCzyDzikie(boolean czyDzikie) {
        this.czyDzikie = czyDzikie;
    }

    public boolean isCzyGrozny() {
        return czyGrozny;
    }

    public void setCzyGrozny(boolean czyGrozny) {
        this.czyGrozny = czyGrozny;
    }

    public boolean isCzySzczepiony() {
        return czySzczepiony;
    }

    public void setCzySzczepiony(boolean czySzczepiony) {
        this.czySzczepiony = czySzczepiony;
    }
}
