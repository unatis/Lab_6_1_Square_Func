package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        DrawSquare(5);

    }

    public static void DrawSquare(int SquareSize){

        for(int i = 0; i < SquareSize; i++){

            for(int j = 0; j < SquareSize; j++){

                System.out.print("*");

            }

            System.out.print("\n");
        }

    }
}
