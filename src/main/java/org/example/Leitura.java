package org.example;

import java.util.Scanner;

public class Leitura {

    App app;
   public void resultado (App app){
       this.app = app;
   }
   public String resultado (){
       byte nota = app.getNumero();
       if (nota >= 90){
           return "Excelente";
       }
       else if (nota >= 80 && nota < 90){

       }
   }

}
