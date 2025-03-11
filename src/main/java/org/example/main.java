package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte numero = scan.nextByte();
        Leitura result = new Leitura();
        result.resultado(new App(numero));

        System.out.print(result.resultado());
    }
}
