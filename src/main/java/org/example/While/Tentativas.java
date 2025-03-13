package org.example.While;

public class Tentativas {
    private NumeroDaSorte numeroDaSorte;
    private int tentativas;

    public Tentativas(int tentativas, NumeroDaSorte numeroDaSorte) {
        while (tentativas != numeroDaSorte.getNumero_da_sorte()) {
            this.tentativas = tentativas;
            this.numeroDaSorte = numeroDaSorte;
            if (tentativas == numeroDaSorte.getNumero_da_sorte()) {
                System.out.println("Parabéns! Você acertou.");
                break;
            } else {
                System.out.println("Tente novamente.");
            }

    }
    }

    public void setNumeroDaSorte(NumeroDaSorte numeroDaSorte) {
        this.numeroDaSorte = numeroDaSorte;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
}
