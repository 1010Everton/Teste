package org.example.While;

import java.util.Random;

public class NumeroDaSorte {
    Random random = new Random();
    private byte numero_da_sorte = (byte) random.nextInt(256);

    public byte getNumero_da_sorte() {
        return numero_da_sorte;
    }
}
