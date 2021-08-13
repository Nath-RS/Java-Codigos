/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9;

/**
 *
 * @author natha
 */
public class MainExercicio9 {

    /**
     * @param args the command line arguments
     * 
     * Uma empresa contratou 15 funcionários temporários. De acordo com o valor das vendas mensais, os
       funcionários adquirem pontos que determinarão seus salários ao final de cada mês. Sabe-se que esses
       funcionários trabalharão nos meses de novembro a janeiro do ano subsequente. Faça um programa que:
            a) Leia as pontuações nos três meses de cada funcionário;
            b) Calcule e mostre a pontuação geral de cada funcionário nos três meses;
            c) Calcule e mostre a média das pontuações de cada funcionário nos três meses.
     * 
     */
    public static void main(String[] args) {
    int funcionarios = 15;
    int meses = 3;
    int pontos_novembro[]= new int[funcionarios];
    int pontos_dezembro[]= new int[funcionarios];
    int pontos_janeiro[]= new int[funcionarios];
    
    float media_pontos[]= new float[funcionarios];
    int total_pontos[]= new int[funcionarios];
    
    for(int i=0;i < funcionarios; i++){
        pontos_novembro[i] =(int) Math.round(Math.random()*100);
        pontos_dezembro[i] =(int) Math.round(Math.random()*150);
        pontos_janeiro[i] =(int) Math.round(Math.random()*90);
        
        
    }
    //o total e a média parece não calcular corretamente. vou rerificar o que pode esta de errado.
    for(int i=0;i<funcionarios; i++){
        total_pontos[i] = Math.round(pontos_novembro[i] + pontos_dezembro[i] + pontos_janeiro[i]);
        media_pontos[i] = total_pontos[i] / meses;
    }
    System.out.print("\t\tNOVEMBRO\tDEZEMBRO\tJANEIRO\t\tMÉDIA\t\tTOTAL GERAL\n");  
    
    for(int i= 0;i < funcionarios;i++){
          System.out.print("Funcionário " + (i+1) + ":\t");
          System.out.print(pontos_novembro[i] + "\t\t");
          System.out.print(pontos_novembro[i] + "\t\t");
          System.out.print(pontos_novembro[i] + "\t\t");
          
          System.out.print(Math.round(media_pontos[i]));
          System.out.print("\t\t" + total_pontos[i] + "\t\t\n");
      }
    }
    
}
