package Cw6;

public class WeterynarzKotow {

    private boolean ugryziony;

    public void WykonajSzczepienie(Kotowate k){
        if (k.isCzySzczepiony()==false){
            k.setCzySzczepiony(true);
            System.out.println("Wykonaliśmy szczepienie");}
        else {
            System.out.println("Już był szczepiony");
        }

    }

    public boolean isUgryziony() {
        return ugryziony;
    }

    public void setUgryziony(boolean ugryziony) {
        this.ugryziony = ugryziony;
    }
}
