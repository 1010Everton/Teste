package org.example.While;

public class Tentativa {
    private NumeroDaSorte numeroDaSorte;
    private int tentativa;

    public Tentativa(int tentativa, NumeroDaSorte numeroDaSorte) {
            this.tentativa = tentativa;
            this.numeroDaSorte = numeroDaSorte;
            while (tentativa != numeroDaSorte.getNumero_da_sorte()){
                System.out.print("Tente novamente : ");
                tentativa = new java.util.Scanner(System.in).nextInt();
            }
            if (tentativa == numeroDaSorte.getNumero_da_sorte()){
                System.out.print("Parabens!Você Acertou");
            }
    }


    public void setNumeroDaSorte(NumeroDaSorte numeroDaSorte) {
        this.numeroDaSorte = numeroDaSorte;
    }

    public int getTentativas() {
        return tentativa;
    }

    public void setTentativas(int tentativas) {
        this.tentativa = tentativas;
    }
}
