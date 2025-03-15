package org.example.While;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumeroDaSorte sorte = new NumeroDaSorte();
        System.out.print(sorte.getNumero_da_sorte());
        System.out.print(" Digite um número entre 0 e 255:");
        int tentativa1 = scan.nextInt();

        new Tentativa(tentativa1,sorte);
    }

}
