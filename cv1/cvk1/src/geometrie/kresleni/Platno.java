package geometrie.kresleni;

import geometrie.utvary.Kruh;

public class Platno {

    //Ve třídě Platno vytvořte proměnnou k typu Kruh

    //geometrie.utvary.Kruh k;
    Kruh k;


    //Ve třídě Platno vytvořte metodu max, která bude vracet větší ze dvou celých čísel zadaných jako argumenty.
    //V metodě bude využit ternární operátor.

    double max (double x, double y) {
        return x > y ? x : y;
    }


    //Přetížení metod

    double max (int x, double y) {
        return x > y ? x : y;
    }

    double max (double x, int y) {
        return x > y ? x : y;
    }

    int max (int x, int y) {
        return x > y ? x : y;
    }

    void useMax(){
        double d1 = max(2.54, 5.17);
        double d2 = max(2, 5.0);
        double d3 = max(2.0, 5);
        int d4 = max(2,5);

        int a = 5;
        double d5 = max(2, (double)a);
    }
}
