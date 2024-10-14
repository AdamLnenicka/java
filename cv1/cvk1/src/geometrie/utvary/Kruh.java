package geometrie.utvary;

public class Kruh {
    //Vytvořte konstantu PI s hodnotou 3.1415927
    final double PI = 3.14159265358979323846;

    //Vytvořte celočíselné proměnné polomer, stredX a stredY
    int polomer, stredX, stredY;

    //Vytvořte metodu obvod, která bude vracet obvod kruhu
    double obvod(){
        return 2 * PI * polomer;
    }

    //Vytvořte metodu obvodInt, která bude vracet obvod kruhu s useknutou desetinnou částí
    int obvodInt(){
        //return (int)(2 * PI * stredX);
        return (int) obvod();
    }


    //Přidejte gettery a settery pro všechny proměnné
    // alt + insert

    public int getPolomer() {
        return polomer;
    }

    public int getStredX() {
        return stredX;
    }

    public int getStredY() {
        return stredY;
    }

    public void setPolomer(int polomer) {
        this.polomer = polomer;
    }

    public void setStredX(int stredX) {
        this.stredX = stredX;
    }

    public void setStredY(int stredY) {
        this.stredY = stredY;
    }
}
