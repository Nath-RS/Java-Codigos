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
    float pontos_novembro[]= new float[funcionarios];
    float pontos_dezembro[]= new float[funcionarios];
    float pontos_janeiro[]= new float[funcionarios];
    
    float media_pontos[]= new float[funcionarios];
    float total_pontos[]= new float[funcionarios];
    
    for(int i=0;i < funcionarios; i++){
        pontos_novembro[i] =(float) Math.round(Math.random()*100);
        pontos_dezembro[i] =(float) Math.round(Math.random()*150 + 5);
        pontos_janeiro[i] = (float) Math.round(Math.random()*90 + 7);
        
        
    }
    //o total e a média parece não calcular corretamente. vou rerificar o que pode esta de errado.
    
    for(int i=0;i<funcionarios; i++){
        total_pontos[i] = pontos_novembro[i] + pontos_dezembro[i] + pontos_janeiro[i];
        media_pontos[i] = total_pontos[i] / meses;
    }
    System.out.print("\t\tNOVEMBRO\tDEZEMBRO\tJANEIRO\t\tMÉDIA\t\tTOTAL GERAL\n");  
    
    for(int i= 0;i < funcionarios;i++){
          System.out.print("Funcionário " + (i+1) + ":\t");
          System.out.print(pontos_novembro[i] + "\t\t");
          System.out.print(pontos_dezembro[i] + "\t\t");
          System.out.print(pontos_janeiro[i] + "\t\t");
          
          System.out.printf("%.2f",media_pontos[i]);
          System.out.print("\t\t" + total_pontos[i] + "\t\t\n");
      }
    }
    
}
