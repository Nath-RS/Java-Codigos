/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;


/**
 *
 * @author natha
 */
public class MainExercicio2 {

    /**
     * @param args the command line arguments
     * 
     * Exercicios
     */
    public static void main(String[] args) {
        int vetor[]= new int[5];
        int acumulador=0;
        
         for(int i = 0;i < vetor.length;i++){
           vetor[i] = (int) Math.round(Math.random()*10);
           if(vetor[i] % 2 == 0){
             acumulador = acumulador + vetor[i];  
           }
           System.out.println(vetor[i]);
           
           }
         
        System.out.println("A soma dos números pares é " + acumulador);
    }
    
}
