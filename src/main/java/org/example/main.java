package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte nota = scan.nextByte();
        App notapv = new App(nota);

        System.out.print(notapv);
    }
}
