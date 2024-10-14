package geometrie.kresleni;

import geometrie.utvary.Kruh;

public class Platno {

    private Kruh k;

    public Platno(Kruh k){
        this.k = k;
    }
    
    public int max(int a, int b){
        int maximum = (a > b) ? a : b;
        return maximum;
    }
}

//Ve třídě Platno vytvořte proměnnou k typu Kruh. Vyzkoušejte si různé metody importu tříd.
//Vyzkoušejte, co způsobí změna třídy Kruh na neveřejnou.

//Ve třídě Platno vytvořte metodu max, která bude vracet větší ze dvou celých čísel zadaných jako argumenty.
//V metodě bude využit ternární operátor.