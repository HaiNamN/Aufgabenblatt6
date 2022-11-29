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
        int x = eingabe.leseInteger();
        int y = eingabe.leseInteger();
        int[][] schlachtFeld = new int[x][y];

        for (int i=0; i<=x*y; i++) {
            int a = 0++;
            int b = 0++;
            int c = 0++;
           schlachtFeld[a][b] = c;
            System.out.println(test);
        }
    }
}


