package Cw6;

import java.util.Random;

public abstract class Kotowate extends  Zwierze{

    public void Ugryz(WeterynarzKotow x){
        Random ran = new Random();
        if(ran.nextBoolean()){
            System.out.println(this.getNazwa() + " Ugryzł");
            x.setUgryziony(true);
            if(!this.isCzySzczepiony()){
                System.out.println("Weterynarz pilnie potrzebuje hospitalizacji!!!");
            }
        }
        else{
            System.out.println(this.getNazwa() + " Nie ugryzł");
        }
    }

    public Kotowate() {

    }
}
