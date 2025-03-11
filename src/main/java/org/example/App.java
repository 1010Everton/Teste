package org.example;

/**
 *  1 - Peça ao usuário para inserir uma nota (valor numérico entre 0 e 100).
 *
 * Avalie a nota usando a estrutura de controle if-else e determine a classificação da nota de acordo com a seguinte tabela:
 *
 * Nota >= 90: Excelente
 *
 * Nota >= 80 e < 90: Muito bom
 *
 * Nota >= 70 e < 80: Bom
 *
 * Nota >= 60 e < 70: Satisfatório
 *
 * Nota < 60: Insuficiente
 *
 */
public class App 
{
    private byte numero;
    public App(byte numero){
            this.numero = numero;
    }

    @Override
    public String toString() {
        if (numero >100 || numero<0){
            return "valor invalido digite uma nota entre 0 e 100";
        }
        else {return "nota : " +
                numero
                ;}
    }

    public byte getNumero() {
        return numero;
    }
}
