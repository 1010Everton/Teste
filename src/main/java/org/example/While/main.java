package org.example.While;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumeroDaSorte sorte = new NumeroDaSorte();

        System.out.println("Digite um número entre 0 e 255:");
        int tentativa1 = scan.nextInt();

        new Tentativas(tentativa1, sorte);
    }

}
