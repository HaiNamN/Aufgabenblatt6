/*
public class Slider {
    public void sliderGame() {
        int[][] arr = new int[4][4];
        arr[0][0] = 0;
        arr[0][1] = 4;
        arr[0][2] = 8;
        arr[0][3] = 12;
        arr[1][0] = 1;
        arr[1][1] = 5;
        arr[1][2] = 9;
        arr[1][3] = 13;
        arr[2][0] = 2;
        arr[2][1] = 6;
        arr[2][2] = 10;
        arr[2][3] = 14;
        arr[3][0] = 3;
        arr[3][1] = 7;
        arr[3][2] = 11;
        arr[3][3] = 15;
        System.out.println(arr[0][0]);
        for (int i=0; i<0; i++) {
            double rand Math.random();
        }

        System.out.println("Gebe Array ein das du mit 0 taschen willst (Es können nur benachbarte Arrays getauscht werden)");


        /*
         0  1  2  3
         4  5  6  7
         8  9 10 11
        12 13 14 15

        System.out.println("11 12 13 14");
        System.out.println(" 1  2  3  4");
        System.out.println(" 8  7  6  5");
        System.out.println("    9 10 15");


    }

    }
}
 */

public class SchiffeVersenken {
    public void schiffeVersenken() {
        EinUndAusgabe eingabe = new EinUndAusgabe();

        /*Spielfeld erstellen Spieler 1*/
        System.out.println("Spieler 1: Wählen Sie die Größe des Spielfeldes aus (x)");
        int x1 = eingabe.leseInteger();
        System.out.println("Spieler 1: Wählen Sie die Größe des Spielfeldes aus (y)");
        int y1 = eingabe.leseInteger();

        /*Spielfeld erstellen Spieler 2*/
        System.out.println("Spieler 1: Wählen Sie die Größe des Spielfeldes aus (x)");
        int x2 = eingabe.leseInteger();
        System.out.println("Spieler 2: Wählen Sie die Größe des Spielfeldes aus (y)");
        int y2 = eingabe.leseInteger();

        int[][] schlachtFeld1 = new int[x1][y1];
        int[][] schlachtFeld2 = new int[x2][y2];

       /* Kodierung: 0= frei,
        1=Boot,
        2=getroffen,
        3=Feld geraten, aber kein Boot.*/
       /* Dimensionen einstellen*/

        for (int i = 1; i < y1; i++) {          //erste Spalte
            int a = i;
            int b = 0;
            int c = schlachtFeld1.length * i +1;
            schlachtFeld1[a][b] = c;

        }

        for (int i = 0; i < y1; i++) {
            int a = 0;
            int b = i;
            int c = i;
            schlachtFeld1[a][b] = c;
                                                //erste Reihe 0 1 2 3 4 ...
        }

        for (int s=1; s < x1 ;s++) {             //dieser Code macht 0 1 2 3 4 aber nicht 0  1  2  3  4
                                                //                   0 1 2 3 4            5 "6"  7  8  9
                                                //                                        10 11 12 13 14
            for (int i = 1; i < y1; i++) {
                int a = s;
                int b = i;                       // das geht erst ab der 2 Reihe
                int c = schlachtFeld1.length +i;

                schlachtFeld1[a][b] = c;  //erstellt ein horizontales Feld bei [0][..] 1 2 3 4 5 6 ...
            }
        }



        for (int i=0; i<=y1; i++) {
            int a = 1;                  //bildet zweite Reihe
            int b = i;
            int c = y1++;               //wenn erste Reihe bei 10 endet, dann startet die zweite Reihe bei 10 + 1 = 11
            schlachtFeld1[a][b] = c;



 /*        0 1 2 3
           4 5 6 7*/
    }
}


