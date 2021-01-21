package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[1][2] = 103;

        int row = flats.length;
        int col = flats[0].length;
        System.out.println(row);
        System.out.println(col);
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" \n");

        }
    }
}
