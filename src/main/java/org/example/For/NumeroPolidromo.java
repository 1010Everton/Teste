package org.example.For;
       /** O usuário deve informar um número inicial e um número final.
        O programa deve percorrer esse intervalo e exibir todos os números palíndromos encontrados.
        Utilize um laço for para iterar sobre o intervalo.
        Não utilize bibliotecas externas para verificar palíndromos.**/
public class NumeroPolidromo {
       int numeropolidrono;

              public NumeroPolidromo(int numeropolidrono) {
                     this.numeropolidrono = numeropolidrono;
                     for (int intervalo = 200 ;numeropolidrono <= intervalo;numeropolidrono++){
                            if(ePolidrono(numeropolidrono)){
                                   System.out.print(numeropolidrono + ",");
                            }

                     }
              }
              public boolean ePolidrono(int numero){
                     String str = Integer.toString(numero);
                     String reverso = new StringBuilder(str).reverse().toString();
                     return str.equals(reverso);
              }
       }
