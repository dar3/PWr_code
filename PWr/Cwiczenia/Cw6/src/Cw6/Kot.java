package Cw6;

import java.util.Random;

public class Kot extends  Kotowate{

    public Kot() {
        this.setNazwa("kot");
    }


    @Override
    public void Ugryz(WeterynarzKotow x) {
        super.Ugryz(x);
    }

    @Override
    public String DajGlos() {
        return "Miau, miau, miau";
    }
}
