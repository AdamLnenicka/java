package geometrie.utvary;

public class Kruh {

    /*
        •	Vytvořte konstantu PI s hodnotou 3.1415927.
        •	Vytvořte celočíselné proměnné polomer, stredX a stredY.
        •	Vytvořte metodu obvod, která bude vracet obvod kruhu.
        •	Vytvořte metodu obvodInt, která bude vracet obvod kruhu s useknutou desetinnou částí.
        •	Přidejte gettery a settery pro všechny proměnné.
     */

    public static final double PI = 3.1415927;
    private int polomer, stredX, stredY;

    public double obvod(){
        return 2 * PI * polomer;
    }

    public int obvodINT(){
        return (int) obvod();
    }

    //gettery a settery
    public int getPolomer(){
        return polomer;
    }

    public int getStredX(){
        return stredX;
    }

    public int getStredY(){
        return stredY;
    }

    public void setPolomer(int polomer){
        this.polomer = polomer;
    }

    public void setStredX(int stredX){
        this.stredX = stredX;
    }

    public void setStredY(int stredY){
        this.stredY=stredY;
    }
}
