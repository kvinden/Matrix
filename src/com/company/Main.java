package com.company;

public class Main {
    public static void main(String[] args) {
        int[][] oneMat = new int[3][3];
        int[][] twoMat = new int[3][3];
        int[][] resMat = new int[3][3];
        int[][] multMat = new int[3][3];
        oneMat = printMatrix(oneMat);
        twoMat = printMatrix(twoMat);
        outputMatrix(oneMat);
        System.out.println("и");
        outputMatrix(twoMat);
        for (int i = 0; i < resMat.length; i++) {
            for (int j = 0; j < resMat[i].length; j++) {
                resMat[i][j] = oneMat[i][j] + twoMat[i][j];
            }
        }
        System.out.println("—умма матриц:");
        outputMatrix(resMat);
        System.out.println("”ножение на число 5:");
        for (int i = 0; i < resMat.length; i++) {
            for (int j = 0; j < resMat[i].length; j++) {
                multMat[i][j] = resMat[i][j] * 5;
            }
        }
        outputMatrix(multMat);
    }

    static int[][] printMatrix(int[][] tmpMat) {
        for (int i = 0; i < tmpMat.length; i++) {
            for (int j = 0; j < tmpMat[i].length; j++) {
                tmpMat[i][j] = (int) (Math.random() * 10);
            }
        }
        return tmpMat;
    }

    static void outputMatrix (int[][] tmpMat) {
        for (int[] ints : tmpMat) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
